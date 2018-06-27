package com.api.swagger.testService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
@Api(value = "/rest", description = "测试服务")
@Path("/api")
public interface SwaggerService {

	@Path("/")
	@GET
	@ApiOperation(
            value = "接口测试",
            notes = "获取当前绑定的用户"
     )
	public void test(@ApiParam("name")@QueryParam("name")String name,
			@ApiParam("pass")@QueryParam("pass")String pass);
	
	@Path("/test")
	@GET
	@ApiOperation(
            value = "接口测试1",
            notes = "获取当前绑定的用户1"
     )
	public void test1(@ApiParam("name")@QueryParam("name")String name,
			@ApiParam("pass")@QueryParam("pass")String pass);
}
