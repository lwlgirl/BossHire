package com.lwl.bosshire.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeIsNull() {
            addCriterion("user_graduate_time is null");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeIsNotNull() {
            addCriterion("user_graduate_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeEqualTo(Date value) {
            addCriterion("user_graduate_time =", value, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeNotEqualTo(Date value) {
            addCriterion("user_graduate_time <>", value, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeGreaterThan(Date value) {
            addCriterion("user_graduate_time >", value, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_graduate_time >=", value, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeLessThan(Date value) {
            addCriterion("user_graduate_time <", value, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_graduate_time <=", value, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeIn(List<Date> values) {
            addCriterion("user_graduate_time in", values, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeNotIn(List<Date> values) {
            addCriterion("user_graduate_time not in", values, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeBetween(Date value1, Date value2) {
            addCriterion("user_graduate_time between", value1, value2, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andUserGraduateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_graduate_time not between", value1, value2, "userGraduateTime");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIsNull() {
            addCriterion("education_background is null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIsNotNull() {
            addCriterion("education_background is not null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundEqualTo(String value) {
            addCriterion("education_background =", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotEqualTo(String value) {
            addCriterion("education_background <>", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThan(String value) {
            addCriterion("education_background >", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("education_background >=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThan(String value) {
            addCriterion("education_background <", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThanOrEqualTo(String value) {
            addCriterion("education_background <=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLike(String value) {
            addCriterion("education_background like", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotLike(String value) {
            addCriterion("education_background not like", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIn(List<String> values) {
            addCriterion("education_background in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotIn(List<String> values) {
            addCriterion("education_background not in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundBetween(String value1, String value2) {
            addCriterion("education_background between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotBetween(String value1, String value2) {
            addCriterion("education_background not between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearIsNull() {
            addCriterion("enrollment_year is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearIsNotNull() {
            addCriterion("enrollment_year is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearEqualTo(Date value) {
            addCriterionForJDBCDate("enrollment_year =", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("enrollment_year <>", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearGreaterThan(Date value) {
            addCriterionForJDBCDate("enrollment_year >", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enrollment_year >=", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearLessThan(Date value) {
            addCriterionForJDBCDate("enrollment_year <", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enrollment_year <=", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearIn(List<Date> values) {
            addCriterionForJDBCDate("enrollment_year in", values, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("enrollment_year not in", values, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enrollment_year between", value1, value2, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enrollment_year not between", value1, value2, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityIsNull() {
            addCriterion("association_activity is null");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityIsNotNull() {
            addCriterion("association_activity is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityEqualTo(String value) {
            addCriterion("association_activity =", value, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityNotEqualTo(String value) {
            addCriterion("association_activity <>", value, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityGreaterThan(String value) {
            addCriterion("association_activity >", value, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityGreaterThanOrEqualTo(String value) {
            addCriterion("association_activity >=", value, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityLessThan(String value) {
            addCriterion("association_activity <", value, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityLessThanOrEqualTo(String value) {
            addCriterion("association_activity <=", value, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityLike(String value) {
            addCriterion("association_activity like", value, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityNotLike(String value) {
            addCriterion("association_activity not like", value, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityIn(List<String> values) {
            addCriterion("association_activity in", values, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityNotIn(List<String> values) {
            addCriterion("association_activity not in", values, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityBetween(String value1, String value2) {
            addCriterion("association_activity between", value1, value2, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andAssociationActivityNotBetween(String value1, String value2) {
            addCriterion("association_activity not between", value1, value2, "associationActivity");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerIsNull() {
            addCriterion("expected_career is null");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerIsNotNull() {
            addCriterion("expected_career is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerEqualTo(String value) {
            addCriterion("expected_career =", value, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerNotEqualTo(String value) {
            addCriterion("expected_career <>", value, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerGreaterThan(String value) {
            addCriterion("expected_career >", value, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerGreaterThanOrEqualTo(String value) {
            addCriterion("expected_career >=", value, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerLessThan(String value) {
            addCriterion("expected_career <", value, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerLessThanOrEqualTo(String value) {
            addCriterion("expected_career <=", value, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerLike(String value) {
            addCriterion("expected_career like", value, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerNotLike(String value) {
            addCriterion("expected_career not like", value, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerIn(List<String> values) {
            addCriterion("expected_career in", values, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerNotIn(List<String> values) {
            addCriterion("expected_career not in", values, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerBetween(String value1, String value2) {
            addCriterion("expected_career between", value1, value2, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCareerNotBetween(String value1, String value2) {
            addCriterion("expected_career not between", value1, value2, "expectedCareer");
            return (Criteria) this;
        }

        public Criteria andExpectedCityIsNull() {
            addCriterion("expected_city is null");
            return (Criteria) this;
        }

        public Criteria andExpectedCityIsNotNull() {
            addCriterion("expected_city is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedCityEqualTo(String value) {
            addCriterion("expected_city =", value, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityNotEqualTo(String value) {
            addCriterion("expected_city <>", value, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityGreaterThan(String value) {
            addCriterion("expected_city >", value, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityGreaterThanOrEqualTo(String value) {
            addCriterion("expected_city >=", value, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityLessThan(String value) {
            addCriterion("expected_city <", value, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityLessThanOrEqualTo(String value) {
            addCriterion("expected_city <=", value, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityLike(String value) {
            addCriterion("expected_city like", value, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityNotLike(String value) {
            addCriterion("expected_city not like", value, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityIn(List<String> values) {
            addCriterion("expected_city in", values, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityNotIn(List<String> values) {
            addCriterion("expected_city not in", values, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityBetween(String value1, String value2) {
            addCriterion("expected_city between", value1, value2, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andExpectedCityNotBetween(String value1, String value2) {
            addCriterion("expected_city not between", value1, value2, "expectedCity");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageIsNull() {
            addCriterion("personal_advantage is null");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageIsNotNull() {
            addCriterion("personal_advantage is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageEqualTo(String value) {
            addCriterion("personal_advantage =", value, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageNotEqualTo(String value) {
            addCriterion("personal_advantage <>", value, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageGreaterThan(String value) {
            addCriterion("personal_advantage >", value, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageGreaterThanOrEqualTo(String value) {
            addCriterion("personal_advantage >=", value, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageLessThan(String value) {
            addCriterion("personal_advantage <", value, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageLessThanOrEqualTo(String value) {
            addCriterion("personal_advantage <=", value, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageLike(String value) {
            addCriterion("personal_advantage like", value, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageNotLike(String value) {
            addCriterion("personal_advantage not like", value, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageIn(List<String> values) {
            addCriterion("personal_advantage in", values, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageNotIn(List<String> values) {
            addCriterion("personal_advantage not in", values, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageBetween(String value1, String value2) {
            addCriterion("personal_advantage between", value1, value2, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andPersonalAdvantageNotBetween(String value1, String value2) {
            addCriterion("personal_advantage not between", value1, value2, "personalAdvantage");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}