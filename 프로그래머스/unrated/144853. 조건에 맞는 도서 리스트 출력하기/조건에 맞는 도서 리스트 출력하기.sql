SELECT book_id, TO_CHAR(published_date, 'YYYY-MM-DD') as published_date
FROM book
WHERE TO_CHAR(published_date, 'YYYY') = '2021'
AND category = '인문'
ORDER BY published_date;