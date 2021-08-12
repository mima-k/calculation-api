package jp.co.netprotections.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValueListRequestDto {
	private List<ValueRequestDto> valueListRequest;
	
	public ValueListRequestDto() {
		valueListRequest = new ArrayList<ValueRequestDto>();
	}
	
	public ValueRequestDto getValueData(int index) {
		return valueListRequest.get(index);
	}
	
	public void addSquareValue(ValueRequestDto request) {
		valueListRequest.add(request);
	}
}
