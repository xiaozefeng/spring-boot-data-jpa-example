# Spring Boot Data Jpa Example
quick start
```bash
# build
mvn clean install
# run 
mvn spring-boot:run
```
## 数据库配置
spring.jpa.hibernate.ddl-auto: create 启动时生成表
spring.jpa.hibernate.ddl-auto: create-drop 启动时生成表，关闭时删除表结构
spring.jpa.hibernate.ddl-auto: update 根据实体生成表结构，实体属性变动时，更新表结构，开发时建议使用这种策略
spring.jpa.hibernate.ddl-auto: validate 启动时校验实体和表结构是否一致, 数据结构稳定时采用这个
spring.jpa.hibernate.ddl-auto: none 不采取任何措施

## Jpa 常用操作
![](http://7xv4mv.com1.z0.glb.clouddn.com/blog/2017-12-30-051500.png)

## 动态查询
> PersonRepository 继承 JpaSpecificationExecutor 接口


## Spring Data Rest
> Spring Data Rest 可以将repository 自动输出为REST
资源

## 声明式事务
@Transactional 注解
propagationtion 事务的传递性
isolation 事务的隔离级别
readOnly 指定当前事务是否是只读事务
rollbackFor 指定哪些异常可以引起事务回滚
noRollbackFor 指定哪儿异常不可以引起事务回滚


