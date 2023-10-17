-- 코드를 입력하세요
-- 어느 한 서점에서 판매중인 도서들의 도서 정보(BOOK)
    -- 도서 ID, 카테고리, 저자 ID*, 판매가, 출판일
-- 저자 정보(AUTHOR) 테이블
    -- 저자ID*, 저자명
-- BOOK_SALES 테이블은 각 도서의 날짜 별 판매량 정보를 담은 테이블
    -- 도서ID, 판매일, 판매량

-- 2022년 1월의 도서 판매 데이터를 기준
-- 저자 별, 카테고리 별 매출액(TOTAL_SALES = 판매량 * 판매가) 을 구하여,
-- 저자 ID(AUTHOR_ID), 저자명(AUTHOR_NAME), 카테고리(CATEGORY), 매출액(SALES) 리스트를 출력
-- 결과는 저자 ID를 오름차순으로, 저자 ID가 같다면 카테고리를 내림차순 정렬

-- SELECT AUTHOR_ID, AUTHOR_NAME, CATEGORY, 
--        (SELECT S.BOOK_ID, SUM(SALES * PRICE)
--         FROM BOOK_SALES S
--         JOIN BOOK B
--         ON S.BOOK_ID = B.BOOK_ID
--         GROUP BY S.BOOK_ID
--        )AS TOTAL_SALES

SELECT T.AUTHOR_ID, A.AUTHOR_NAME, T.CATEGORY, T.TOTAL_SALES AS TOTAL_SALES
FROM (SELECT B.AUTHOR_ID, B.CATEGORY, SUM(SALES * PRICE) AS TOTAL_SALES
        FROM BOOK_SALES S
        JOIN BOOK B
        ON S.BOOK_ID = B.BOOK_ID
        WHERE TO_CHAR(S.SALES_DATE, 'YYYYMM') = '202201'
        GROUP BY B.AUTHOR_ID, B.CATEGORY) T
JOIN AUTHOR A
ON T.AUTHOR_ID = A.AUTHOR_ID
ORDER BY T.AUTHOR_ID ASC, T.CATEGORY DESC;