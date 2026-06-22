# Write your MySQL query statement below
SELECT Users.name as NAME , sum(Transactions.amount) as BALANCE from Users 
join Transactions
on Users.account = Transactions.account
group by Transactions.account
having sum(Transactions.amount)>10000;