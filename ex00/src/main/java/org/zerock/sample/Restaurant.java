package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	
	
	public Restaurant() {
		System.out.println("Restaurant() 호출.");
	}
//	@Autowired //bean을 알아서 넣어줌
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
