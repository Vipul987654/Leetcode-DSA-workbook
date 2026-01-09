# Write your MySQL query statement below
select p1.firstName ,p1.lastName ,A1.city ,A1.state
 from Person as p1
left join 
Address as A1
 on p1.PersonId=A1.personId;