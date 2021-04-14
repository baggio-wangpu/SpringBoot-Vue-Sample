package com.example.demo.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class JwtResponse {
	private String token;
	private Long id;
	private String username;
	private String email;
	private List<String> roles;
}
