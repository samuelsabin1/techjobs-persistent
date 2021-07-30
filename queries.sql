## Part 1: Test it with SQL

id INTEGER,
name VARCHAR,
employer_id VARCHAR;

## Part 2: Test it with SQL

select name From employer where="St. Louis City";

## Part 3: Test it with SQL

DROP TABLE employer;

## Part 4: Test it with SQL

select name, description
from skill
Inner join job_skills on skill.id = job_skills.skill_id
where job_skills.jobs_id is not null
order by name DESC;