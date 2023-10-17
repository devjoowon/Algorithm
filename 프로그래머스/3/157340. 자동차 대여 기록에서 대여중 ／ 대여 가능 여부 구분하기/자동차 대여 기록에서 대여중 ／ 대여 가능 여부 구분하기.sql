-- 코드를 입력하세요
-- 자동차 대여 기록 정보를 담은 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블
    -- 자동차 대여 기록 ID, 자동차 ID, 대여 시작일, 대여 종료일

--  2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 이라고 표시하고, 대여 중이지 않은 자동차인 경우 '대여 가능'을 표시하는 컬럼(컬럼명: AVAILABILITY)을 추가
-- 반납 날짜가 2022년 10월 16일인 경우에도 '대여중'으로 표시해주시고
-- 자동차 ID와 AVAILABILITY 리스트를 출력
-- 결과는 자동차 ID를 기준으로 내림차순 정렬

SELECT CAR_ID,
       CASE WHEN CAR_ID NOT IN (SELECT CAR_ID
                                FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                                WHERE '2022-10-16'
                                    BETWEEN TO_CHAR(START_DATE, 'YYYY-MM-DD')
                                    AND TO_CHAR(END_DATE, 'YYYY-MM-DD'))
            THEN '대여 가능'
            ELSE '대여중'
       END AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC;