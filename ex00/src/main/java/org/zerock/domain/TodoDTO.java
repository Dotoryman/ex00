package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	private String todo;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dueDate; // ���ڿ� (2023-05-05) -> Date(
}
