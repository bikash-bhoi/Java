create table product (product_id number(5) PRIMARY KEY, 
                      product_name varchar2(100));

create or replace public synonym product for bikash.product;                      
                      
create table sales (sale_id number(5) PRIMARY KEY, 
                    product_id number(5) REFERENCES product(product_id),
                    year number(4),
                    quantity number(4),
                    amount number(6));
                    
insert into product values(100,'Nokia');
insert into product values(200,'IPhone');
insert into product values(300,'Samsung');
insert into product values(400,'RedMi');
commit;

insert into sales values (1, 100, 2010, 25, 5000);
insert into sales values (2, 100, 2011, 16, 5000);
insert into sales values (3, 100, 2012, 8, 11000);
insert into sales values (4, 200, 2010, 10, 9000);
insert into sales values (5, 200, 2011, 15, 9000);
insert into sales values (6, 200, 2012, 20, 9000);
insert into sales values (7, 300, 2010, 20, 7000);
insert into sales values (8, 300, 2011, 18, 12000);
insert into sales values (9, 300, 2012, 20, 7000);
commit;

select * from product;
select * from sales;

--(6)
select p.product_name
  from (select year,product_id,quantity - lead(quantity,1,0) over (partition by PRODUCT_id order by year desc) diff
        from sales) sd, 
        product p
  where p.product_id = sd.product_id
  group by p.product_name
  having min(sd.diff) > 0;
