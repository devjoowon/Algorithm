-- 코드를 입력하세요
SELECT C.author_id, C.author_name, B.category, SUM(A.sales * B.price) AS total_sales
FROM book_sales A, book B, author C
WHERE A.book_id = B.book_id
AND B.author_id = C.author_id
AND EXTRACT(year FROM A.sales_date) = 2022
AND EXTRACT(month FROM A.sales_date) = 1
GROUP BY C.author_id, C.author_name, B.category
ORDER BY C.author_id asc, B.category desc;