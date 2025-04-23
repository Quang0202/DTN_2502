package vti.accountmanagement.utils;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import java.util.ArrayList;
import java.util.List;

public class SortUtils {

    // Prevent instantiation
    private SortUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static Sort getSort(String[] sort) {
        List<Order> orders = new ArrayList<>();
        if (sort[0].contains(",")) {
            // will sort more than 2 columns
            for (String sortOrder : sort) {
                // sortOrder="column, direction"
                String[] sortParts = sortOrder.split(",");
                orders.add(new Order(getSortDirection(sortParts[1]), sortParts[0]));
            }
        } else {
            // sort=[column, direction]
            orders.add(new Order(getSortDirection(sort[1]), sort[0]));
        }
        return Sort.by(orders);
    }

    private static Sort.Direction getSortDirection(String direction) {
        if (direction.equalsIgnoreCase("asc")) {
            return Sort.Direction.ASC;
        } else if (direction.equalsIgnoreCase("desc")) {
            return Sort.Direction.DESC;
        }

        return Sort.Direction.ASC;
    }
}
