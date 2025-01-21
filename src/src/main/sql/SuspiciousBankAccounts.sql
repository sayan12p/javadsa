wit cte as (select t.account_id,DATE_FORMAT('%y%m') as yr_mth, SUM(Amount) as Income from Transactions where type='Creditor'
group by account_id, DATE_FORMAT('%y%m'))

with cte2 as (
select c.*,a.max_income,LEAD(c.yr_mth) over(PARTtition by c.account_id order by yr_mth) as next_mth
from cte c left join accounts a on c.account_id =a.account_id where c.income > a.max_income)

select deistinct(account_id ) from cte2 where next_mth-yr_mth=1

