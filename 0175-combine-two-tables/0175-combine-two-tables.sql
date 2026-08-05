# Write your MySQL query statement below
select e.firstName,e.lastName,f.city,f.state from Person e left join Address f ON e.personId=f.personId