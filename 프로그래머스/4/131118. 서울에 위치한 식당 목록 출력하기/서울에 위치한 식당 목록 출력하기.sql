-- 코드를 입력하세요
-- 식당의 정보를 담은 REST_INFO 테이블
    -- 식당 ID*, 식당 이름, 음식 종류, 조회수, 즐겨찾기수, 주차장 유무, 주소, 전화번호
-- 식당의 리뷰 정보를 담은 REST_REVIEW 테이블
    -- 리뷰 ID, 식당 ID*, 회원 ID, 점수, 리뷰 텍스트, 리뷰 작성일
    
-- 서울에 위치한 식당
-- 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회
-- 리뷰 평균점수는 소수점 세 번째 자리에서 반올림
    -- ROUND(AVG(REVIEW_SCORE), 2)
-- 결과는 평균점수를 기준으로 내림차순 정렬, 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬
SELECT R.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS, ROUND(AVG(R.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO I
JOIN REST_REVIEW R
ON I.REST_ID = R.REST_ID
WHERE I.ADDRESS LIKE '서울%'
GROUP BY R.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS
ORDER BY SCORE DESC, FAVORITES DESC;