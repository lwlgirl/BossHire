package com.lwl.bosshire.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CVExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CVExample() {
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

        public Criteria andCvIdIsNull() {
            addCriterion("cv_id is null");
            return (Criteria) this;
        }

        public Criteria andCvIdIsNotNull() {
            addCriterion("cv_id is not null");
            return (Criteria) this;
        }

        public Criteria andCvIdEqualTo(Integer value) {
            addCriterion("cv_id =", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdNotEqualTo(Integer value) {
            addCriterion("cv_id <>", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdGreaterThan(Integer value) {
            addCriterion("cv_id >", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cv_id >=", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdLessThan(Integer value) {
            addCriterion("cv_id <", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdLessThanOrEqualTo(Integer value) {
            addCriterion("cv_id <=", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdIn(List<Integer> values) {
            addCriterion("cv_id in", values, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdNotIn(List<Integer> values) {
            addCriterion("cv_id not in", values, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdBetween(Integer value1, Integer value2) {
            addCriterion("cv_id between", value1, value2, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cv_id not between", value1, value2, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvUidIsNull() {
            addCriterion("cv_uid is null");
            return (Criteria) this;
        }

        public Criteria andCvUidIsNotNull() {
            addCriterion("cv_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCvUidEqualTo(Integer value) {
            addCriterion("cv_uid =", value, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvUidNotEqualTo(Integer value) {
            addCriterion("cv_uid <>", value, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvUidGreaterThan(Integer value) {
            addCriterion("cv_uid >", value, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cv_uid >=", value, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvUidLessThan(Integer value) {
            addCriterion("cv_uid <", value, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvUidLessThanOrEqualTo(Integer value) {
            addCriterion("cv_uid <=", value, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvUidIn(List<Integer> values) {
            addCriterion("cv_uid in", values, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvUidNotIn(List<Integer> values) {
            addCriterion("cv_uid not in", values, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvUidBetween(Integer value1, Integer value2) {
            addCriterion("cv_uid between", value1, value2, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvUidNotBetween(Integer value1, Integer value2) {
            addCriterion("cv_uid not between", value1, value2, "cvUid");
            return (Criteria) this;
        }

        public Criteria andCvFullNameIsNull() {
            addCriterion("cv_full_name is null");
            return (Criteria) this;
        }

        public Criteria andCvFullNameIsNotNull() {
            addCriterion("cv_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andCvFullNameEqualTo(String value) {
            addCriterion("cv_full_name =", value, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameNotEqualTo(String value) {
            addCriterion("cv_full_name <>", value, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameGreaterThan(String value) {
            addCriterion("cv_full_name >", value, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("cv_full_name >=", value, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameLessThan(String value) {
            addCriterion("cv_full_name <", value, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameLessThanOrEqualTo(String value) {
            addCriterion("cv_full_name <=", value, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameLike(String value) {
            addCriterion("cv_full_name like", value, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameNotLike(String value) {
            addCriterion("cv_full_name not like", value, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameIn(List<String> values) {
            addCriterion("cv_full_name in", values, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameNotIn(List<String> values) {
            addCriterion("cv_full_name not in", values, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameBetween(String value1, String value2) {
            addCriterion("cv_full_name between", value1, value2, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvFullNameNotBetween(String value1, String value2) {
            addCriterion("cv_full_name not between", value1, value2, "cvFullName");
            return (Criteria) this;
        }

        public Criteria andCvSexIsNull() {
            addCriterion("cv_sex is null");
            return (Criteria) this;
        }

        public Criteria andCvSexIsNotNull() {
            addCriterion("cv_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCvSexEqualTo(Integer value) {
            addCriterion("cv_sex =", value, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvSexNotEqualTo(Integer value) {
            addCriterion("cv_sex <>", value, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvSexGreaterThan(Integer value) {
            addCriterion("cv_sex >", value, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("cv_sex >=", value, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvSexLessThan(Integer value) {
            addCriterion("cv_sex <", value, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvSexLessThanOrEqualTo(Integer value) {
            addCriterion("cv_sex <=", value, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvSexIn(List<Integer> values) {
            addCriterion("cv_sex in", values, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvSexNotIn(List<Integer> values) {
            addCriterion("cv_sex not in", values, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvSexBetween(Integer value1, Integer value2) {
            addCriterion("cv_sex between", value1, value2, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvSexNotBetween(Integer value1, Integer value2) {
            addCriterion("cv_sex not between", value1, value2, "cvSex");
            return (Criteria) this;
        }

        public Criteria andCvPhoneIsNull() {
            addCriterion("cv_phone is null");
            return (Criteria) this;
        }

        public Criteria andCvPhoneIsNotNull() {
            addCriterion("cv_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCvPhoneEqualTo(String value) {
            addCriterion("cv_phone =", value, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneNotEqualTo(String value) {
            addCriterion("cv_phone <>", value, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneGreaterThan(String value) {
            addCriterion("cv_phone >", value, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cv_phone >=", value, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneLessThan(String value) {
            addCriterion("cv_phone <", value, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneLessThanOrEqualTo(String value) {
            addCriterion("cv_phone <=", value, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneLike(String value) {
            addCriterion("cv_phone like", value, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneNotLike(String value) {
            addCriterion("cv_phone not like", value, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneIn(List<String> values) {
            addCriterion("cv_phone in", values, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneNotIn(List<String> values) {
            addCriterion("cv_phone not in", values, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneBetween(String value1, String value2) {
            addCriterion("cv_phone between", value1, value2, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvPhoneNotBetween(String value1, String value2) {
            addCriterion("cv_phone not between", value1, value2, "cvPhone");
            return (Criteria) this;
        }

        public Criteria andCvBirthIsNull() {
            addCriterion("cv_birth is null");
            return (Criteria) this;
        }

        public Criteria andCvBirthIsNotNull() {
            addCriterion("cv_birth is not null");
            return (Criteria) this;
        }

        public Criteria andCvBirthEqualTo(String value) {
            addCriterion("cv_birth =", value, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthNotEqualTo(String value) {
            addCriterion("cv_birth <>", value, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthGreaterThan(String value) {
            addCriterion("cv_birth >", value, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthGreaterThanOrEqualTo(String value) {
            addCriterion("cv_birth >=", value, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthLessThan(String value) {
            addCriterion("cv_birth <", value, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthLessThanOrEqualTo(String value) {
            addCriterion("cv_birth <=", value, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthLike(String value) {
            addCriterion("cv_birth like", value, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthNotLike(String value) {
            addCriterion("cv_birth not like", value, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthIn(List<String> values) {
            addCriterion("cv_birth in", values, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthNotIn(List<String> values) {
            addCriterion("cv_birth not in", values, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthBetween(String value1, String value2) {
            addCriterion("cv_birth between", value1, value2, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvBirthNotBetween(String value1, String value2) {
            addCriterion("cv_birth not between", value1, value2, "cvBirth");
            return (Criteria) this;
        }

        public Criteria andCvEmailIsNull() {
            addCriterion("cv_email is null");
            return (Criteria) this;
        }

        public Criteria andCvEmailIsNotNull() {
            addCriterion("cv_email is not null");
            return (Criteria) this;
        }

        public Criteria andCvEmailEqualTo(String value) {
            addCriterion("cv_email =", value, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailNotEqualTo(String value) {
            addCriterion("cv_email <>", value, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailGreaterThan(String value) {
            addCriterion("cv_email >", value, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cv_email >=", value, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailLessThan(String value) {
            addCriterion("cv_email <", value, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailLessThanOrEqualTo(String value) {
            addCriterion("cv_email <=", value, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailLike(String value) {
            addCriterion("cv_email like", value, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailNotLike(String value) {
            addCriterion("cv_email not like", value, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailIn(List<String> values) {
            addCriterion("cv_email in", values, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailNotIn(List<String> values) {
            addCriterion("cv_email not in", values, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailBetween(String value1, String value2) {
            addCriterion("cv_email between", value1, value2, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvEmailNotBetween(String value1, String value2) {
            addCriterion("cv_email not between", value1, value2, "cvEmail");
            return (Criteria) this;
        }

        public Criteria andCvWxidIsNull() {
            addCriterion("cv_wxid is null");
            return (Criteria) this;
        }

        public Criteria andCvWxidIsNotNull() {
            addCriterion("cv_wxid is not null");
            return (Criteria) this;
        }

        public Criteria andCvWxidEqualTo(Integer value) {
            addCriterion("cv_wxid =", value, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvWxidNotEqualTo(Integer value) {
            addCriterion("cv_wxid <>", value, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvWxidGreaterThan(Integer value) {
            addCriterion("cv_wxid >", value, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvWxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cv_wxid >=", value, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvWxidLessThan(Integer value) {
            addCriterion("cv_wxid <", value, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvWxidLessThanOrEqualTo(Integer value) {
            addCriterion("cv_wxid <=", value, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvWxidIn(List<Integer> values) {
            addCriterion("cv_wxid in", values, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvWxidNotIn(List<Integer> values) {
            addCriterion("cv_wxid not in", values, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvWxidBetween(Integer value1, Integer value2) {
            addCriterion("cv_wxid between", value1, value2, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvWxidNotBetween(Integer value1, Integer value2) {
            addCriterion("cv_wxid not between", value1, value2, "cvWxid");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeIsNull() {
            addCriterion("cv_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeIsNotNull() {
            addCriterion("cv_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeEqualTo(Date value) {
            addCriterion("cv_create_time =", value, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeNotEqualTo(Date value) {
            addCriterion("cv_create_time <>", value, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeGreaterThan(Date value) {
            addCriterion("cv_create_time >", value, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cv_create_time >=", value, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeLessThan(Date value) {
            addCriterion("cv_create_time <", value, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cv_create_time <=", value, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeIn(List<Date> values) {
            addCriterion("cv_create_time in", values, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeNotIn(List<Date> values) {
            addCriterion("cv_create_time not in", values, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cv_create_time between", value1, value2, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cv_create_time not between", value1, value2, "cvCreateTime");
            return (Criteria) this;
        }

        public Criteria andCvStatusIsNull() {
            addCriterion("cv_status is null");
            return (Criteria) this;
        }

        public Criteria andCvStatusIsNotNull() {
            addCriterion("cv_status is not null");
            return (Criteria) this;
        }

        public Criteria andCvStatusEqualTo(Integer value) {
            addCriterion("cv_status =", value, "cvStatus");
            return (Criteria) this;
        }

        public Criteria andCvStatusNotEqualTo(Integer value) {
            addCriterion("cv_status <>", value, "cvStatus");
            return (Criteria) this;
        }

        public Criteria andCvStatusGreaterThan(Integer value) {
            addCriterion("cv_status >", value, "cvStatus");
            return (Criteria) this;
        }

        public Criteria andCvStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cv_status >=", value, "cvStatus");
            return (Criteria) this;
        }

        public Criteria andCvStatusLessThan(Integer value) {
            addCriterion("cv_status <", value, "cvStatus");
            return (Criteria) this;
        }

        public Criteria andCvStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cv_status <=", value, "cvStatus");
            return (Criteria) this;
        }

        public Criteria andCvStatusIn(List<Integer> values) {
            addCriterion("cv_status in", values, "cvStatus");
            return (Criteria) this;
        }

        public Criteria andCvStatusNotIn(List<Integer> values) {
            addCriterion("cv_status not in", values, "cvStatus");
            return (Criteria) this;
        }

        public Criteria andCvStatusBetween(Integer value1, Integer value2) {
            addCriterion("cv_status between", value1, value2, "cvStatus");
            return (Criteria) this;
        }

        public Criteria andCvStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cv_status not between", value1, value2, "cvStatus");
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