-- 조회컬럼: 의사의 이름, 의사ID, 진료과, 고용일자
-- 조회테이블: DOCTOR
-- 조회조건: MCDP_CD 가 CS or GS인 의사 조회
-- 정렬조건: 고용일자 오름차순, 이름기준 오름차순

SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD,'%Y-%m-%d') as HIRE_YMD
FROM DOCTOR
where MCDP_CD = 'CS' or MCDP_CD = 'GS'
order by HIRE_YMD desc,
        DR_NAME asc;