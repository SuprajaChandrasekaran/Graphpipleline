package com.example.demoquery;

import org.springframework.stereotype.Component;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
@Component
public class Query  implements GraphQLQueryResolver
{
  public String test()
  { 
	  return "Welcome to open Weaver";
  }
 
}
