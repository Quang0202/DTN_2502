package vti.accountmanagement.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Response<T> {
	public String status;
	public T message;
}
