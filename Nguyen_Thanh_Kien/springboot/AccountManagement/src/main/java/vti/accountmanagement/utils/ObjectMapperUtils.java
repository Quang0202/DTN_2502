package vti.accountmanagement.utils;

import lombok.Getter;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.List;

@Getter
public class ObjectMapperUtils {
    private final ModelMapper modelMapper;

    public ObjectMapperUtils() {
        this.modelMapper = new ModelMapper();
        this.modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setPropertyCondition(Conditions.isNotNull())
                .setSkipNullEnabled(true);
    }

    public <D, T> D map(final T entity, Class<D> outClass) {
        return this.modelMapper.map(entity, outClass);
    }

    public <D, T> List<D> mapAll(final Collection<T> entityList, Class<D> outCLass) {
        return entityList.stream()
                .map(entity -> map(entity, outCLass))
                .toList();
    }

    public <D, T> Page<D> mapEntityPageIntoDtoPage(Page<T> entities, Class<D> outCLass) {
        return entities.map(objectEntity -> modelMapper.map(objectEntity, outCLass));
    }
}
