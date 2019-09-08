select h.hacker_id, h.name
from submissions s
join challenges c on s.challenge_id = c.challenge_id
join difficulty d on d.difficulty_level=c.difficulty_level
join hackers h on h.hacker_id=s.hacker_id
where s.score=d.score
group by h.hacker_id, h.name
    having count (c.challenge_id) > 1
order by count(s.hacker_id) desc, h.hacker_id asc;