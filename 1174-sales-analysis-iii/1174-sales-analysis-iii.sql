# Write your MySQL query statement below
select p1.product_id , p1.product_name 
 from Product as p1
join Sales as s1
on p1.product_id=s1.product_id 
group by p1.product_id
having Min(s1.sale_date)>='2019-01-01' and Max(s1.sale_date)<='2019-03-31';
