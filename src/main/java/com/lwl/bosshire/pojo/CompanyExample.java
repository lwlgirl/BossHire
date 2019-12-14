package com.lwl.bosshire.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageIsNull() {
            addCriterion("company_logo_image is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageIsNotNull() {
            addCriterion("company_logo_image is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageEqualTo(String value) {
            addCriterion("company_logo_image =", value, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageNotEqualTo(String value) {
            addCriterion("company_logo_image <>", value, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageGreaterThan(String value) {
            addCriterion("company_logo_image >", value, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageGreaterThanOrEqualTo(String value) {
            addCriterion("company_logo_image >=", value, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageLessThan(String value) {
            addCriterion("company_logo_image <", value, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageLessThanOrEqualTo(String value) {
            addCriterion("company_logo_image <=", value, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageLike(String value) {
            addCriterion("company_logo_image like", value, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageNotLike(String value) {
            addCriterion("company_logo_image not like", value, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageIn(List<String> values) {
            addCriterion("company_logo_image in", values, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageNotIn(List<String> values) {
            addCriterion("company_logo_image not in", values, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageBetween(String value1, String value2) {
            addCriterion("company_logo_image between", value1, value2, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoImageNotBetween(String value1, String value2) {
            addCriterion("company_logo_image not between", value1, value2, "companyLogoImage");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumIsNull() {
            addCriterion("company_emp_num is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumIsNotNull() {
            addCriterion("company_emp_num is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumEqualTo(Integer value) {
            addCriterion("company_emp_num =", value, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumNotEqualTo(Integer value) {
            addCriterion("company_emp_num <>", value, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumGreaterThan(Integer value) {
            addCriterion("company_emp_num >", value, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_emp_num >=", value, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumLessThan(Integer value) {
            addCriterion("company_emp_num <", value, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumLessThanOrEqualTo(Integer value) {
            addCriterion("company_emp_num <=", value, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumIn(List<Integer> values) {
            addCriterion("company_emp_num in", values, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumNotIn(List<Integer> values) {
            addCriterion("company_emp_num not in", values, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumBetween(Integer value1, Integer value2) {
            addCriterion("company_emp_num between", value1, value2, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("company_emp_num not between", value1, value2, "companyEmpNum");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescIsNull() {
            addCriterion("company_simple_desc is null");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescIsNotNull() {
            addCriterion("company_simple_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescEqualTo(String value) {
            addCriterion("company_simple_desc =", value, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescNotEqualTo(String value) {
            addCriterion("company_simple_desc <>", value, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescGreaterThan(String value) {
            addCriterion("company_simple_desc >", value, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescGreaterThanOrEqualTo(String value) {
            addCriterion("company_simple_desc >=", value, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescLessThan(String value) {
            addCriterion("company_simple_desc <", value, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescLessThanOrEqualTo(String value) {
            addCriterion("company_simple_desc <=", value, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescLike(String value) {
            addCriterion("company_simple_desc like", value, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescNotLike(String value) {
            addCriterion("company_simple_desc not like", value, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescIn(List<String> values) {
            addCriterion("company_simple_desc in", values, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescNotIn(List<String> values) {
            addCriterion("company_simple_desc not in", values, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescBetween(String value1, String value2) {
            addCriterion("company_simple_desc between", value1, value2, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleDescNotBetween(String value1, String value2) {
            addCriterion("company_simple_desc not between", value1, value2, "companySimpleDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIsNull() {
            addCriterion("company_desc is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIsNotNull() {
            addCriterion("company_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescEqualTo(String value) {
            addCriterion("company_desc =", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotEqualTo(String value) {
            addCriterion("company_desc <>", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThan(String value) {
            addCriterion("company_desc >", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThanOrEqualTo(String value) {
            addCriterion("company_desc >=", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThan(String value) {
            addCriterion("company_desc <", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThanOrEqualTo(String value) {
            addCriterion("company_desc <=", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLike(String value) {
            addCriterion("company_desc like", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotLike(String value) {
            addCriterion("company_desc not like", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIn(List<String> values) {
            addCriterion("company_desc in", values, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotIn(List<String> values) {
            addCriterion("company_desc not in", values, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescBetween(String value1, String value2) {
            addCriterion("company_desc between", value1, value2, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotBetween(String value1, String value2) {
            addCriterion("company_desc not between", value1, value2, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeIsNull() {
            addCriterion("company_established_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeIsNotNull() {
            addCriterion("company_established_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("company_established_time =", value, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("company_established_time <>", value, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("company_established_time >", value, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("company_established_time >=", value, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeLessThan(Date value) {
            addCriterionForJDBCDate("company_established_time <", value, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("company_established_time <=", value, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("company_established_time in", values, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("company_established_time not in", values, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("company_established_time between", value1, value2, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEstablishedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("company_established_time not between", value1, value2, "companyEstablishedTime");
            return (Criteria) this;
        }

        public Criteria andCompanyUidIsNull() {
            addCriterion("company_uid is null");
            return (Criteria) this;
        }

        public Criteria andCompanyUidIsNotNull() {
            addCriterion("company_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyUidEqualTo(Integer value) {
            addCriterion("company_uid =", value, "companyUid");
            return (Criteria) this;
        }

        public Criteria andCompanyUidNotEqualTo(Integer value) {
            addCriterion("company_uid <>", value, "companyUid");
            return (Criteria) this;
        }

        public Criteria andCompanyUidGreaterThan(Integer value) {
            addCriterion("company_uid >", value, "companyUid");
            return (Criteria) this;
        }

        public Criteria andCompanyUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_uid >=", value, "companyUid");
            return (Criteria) this;
        }

        public Criteria andCompanyUidLessThan(Integer value) {
            addCriterion("company_uid <", value, "companyUid");
            return (Criteria) this;
        }

        public Criteria andCompanyUidLessThanOrEqualTo(Integer value) {
            addCriterion("company_uid <=", value, "companyUid");
            return (Criteria) this;
        }

        public Criteria andCompanyUidIn(List<Integer> values) {
            addCriterion("company_uid in", values, "companyUid");
            return (Criteria) this;
        }

        public Criteria andCompanyUidNotIn(List<Integer> values) {
            addCriterion("company_uid not in", values, "companyUid");
            return (Criteria) this;
        }

        public Criteria andCompanyUidBetween(Integer value1, Integer value2) {
            addCriterion("company_uid between", value1, value2, "companyUid");
            return (Criteria) this;
        }

        public Criteria andCompanyUidNotBetween(Integer value1, Integer value2) {
            addCriterion("company_uid not between", value1, value2, "companyUid");
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