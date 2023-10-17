-- 코드를 입력하세요
-- 환자 정보를 담은 PATIENT 테이블
    -- 환자번호*, 환자이름, 성별코드, 나이, 전화번호
-- 의사 정보를 담은 DOCTOR 테이블
    -- 의사이름, 의사ID*, 면허번호, 고용일자, 진료과코드, 전화번호
-- 진료 예약목록을 담은 APPOINTMENT에 대한 테이블
    -- 진료 예약일시, 진료예약번호, 환자번호*, 진료과코드, 의사ID*, 예약취소여부, 예약취소날짜

--  [1. 2022년 4월 13일] [2. 취소되지 않은] [3. 흉부외과(CS)] 진료 예약 내역을 조회
-- 진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시 항목이 출력되도록 작성
-- 결과는 진료예약일시를 기준으로 오름차순 정렬

SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, A.MCDP_CD, D.DR_NAME, A.APNT_YMD
FROM APPOINTMENT A
JOIN DOCTOR D
ON A.MDDR_ID = D.DR_ID
JOIN PATIENT P
ON A.PT_NO = P.PT_NO
WHERE TO_CHAR(A.APNT_YMD, 'YYYY-MM-DD') = '2022-04-13'
AND A.APNT_CNCL_YN = 'N'
AND A.MCDP_CD = 'CS'
ORDER BY A.APNT_YMD ASC;
