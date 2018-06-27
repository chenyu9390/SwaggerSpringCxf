# SwaggerSpringCxf
swagger继承resultful
通过url：http://localhost:8080/SwaggerSpringCXF/swagger/index.html即可看到效果
和swagger集合时的注意事项:
和Swagger UI的集成：
在GitHub上将swaggerui下载，地址:https://github.com/swagger-api/swagger-ui
解压后将dist文件夹中所有的文件拷贝到webapp/swagger这里的swagger是作者自定义的你可以写为自己创建的目录。
修改index.html中的 http://petstore.swagger.wordnik.com/v2/swagger.json修改为自己项目路径+api-docs,例如：
http://localhost:8080/SwaggerSpringCXF(项目名称)/api(CXF Servlet)/swagger.json：SSMSwagger为项目名称
