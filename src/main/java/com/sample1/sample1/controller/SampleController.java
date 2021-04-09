package com.sample1.sample1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class SampleController 
{
		@GetMapping
		public String getData()
		{
			return "this data is from back end controller getdata";
		}

	}

