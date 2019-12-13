package com.lwl.bosshire.pojo;

import java.util.ArrayList;
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

        public Criteria andCompanyDescribeIsNull() {
            addCriterion("company_describe is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeIsNotNull() {
            addCriterion("company_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeEqualTo(String value) {
            addCriterion("company_describe =", value, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeNotEqualTo(String value) {
            addCriterion("company_describe <>", value, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeGreaterThan(String value) {
            addCriterion("company_describe >", value, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("company_describe >=", value, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeLessThan(String value) {
            addCriterion("company_describe <", value, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeLessThanOrEqualTo(String value) {
            addCriterion("company_describe <=", value, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeLike(String value) {
            addCriterion("company_describe like", value, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeNotLike(String value) {
            addCriterion("company_describe not like", value, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeIn(List<String> values) {
            addCriterion("company_describe in", values, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeNotIn(List<String> values) {
            addCriterion("company_describe not in", values, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeBetween(String value1, String value2) {
            addCriterion("company_describe between", value1, value2, "companyDescribe");
            return (Criteria) this;
        }

        public Criteria andCompanyDescribeNotBetween(String value1, String value2) {
            addCriterion("company_describe not between", value1, value2, "companyDescribe");
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

        public Criteria andCompanyLeaderIsNull() {
            addCriterion("company_leader is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderIsNotNull() {
            addCriterion("company_leader is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderEqualTo(String value) {
            addCriterion("company_leader =", value, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderNotEqualTo(String value) {
            addCriterion("company_leader <>", value, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderGreaterThan(String value) {
            addCriterion("company_leader >", value, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("company_leader >=", value, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderLessThan(String value) {
            addCriterion("company_leader <", value, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderLessThanOrEqualTo(String value) {
            addCriterion("company_leader <=", value, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderLike(String value) {
            addCriterion("company_leader like", value, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderNotLike(String value) {
            addCriterion("company_leader not like", value, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderIn(List<String> values) {
            addCriterion("company_leader in", values, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderNotIn(List<String> values) {
            addCriterion("company_leader not in", values, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderBetween(String value1, String value2) {
            addCriterion("company_leader between", value1, value2, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyLeaderNotBetween(String value1, String value2) {
            addCriterion("company_leader not between", value1, value2, "companyLeader");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerIsNull() {
            addCriterion("company_career is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerIsNotNull() {
            addCriterion("company_career is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerEqualTo(String value) {
            addCriterion("company_career =", value, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerNotEqualTo(String value) {
            addCriterion("company_career <>", value, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerGreaterThan(String value) {
            addCriterion("company_career >", value, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerGreaterThanOrEqualTo(String value) {
            addCriterion("company_career >=", value, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerLessThan(String value) {
            addCriterion("company_career <", value, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerLessThanOrEqualTo(String value) {
            addCriterion("company_career <=", value, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerLike(String value) {
            addCriterion("company_career like", value, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerNotLike(String value) {
            addCriterion("company_career not like", value, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerIn(List<String> values) {
            addCriterion("company_career in", values, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerNotIn(List<String> values) {
            addCriterion("company_career not in", values, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerBetween(String value1, String value2) {
            addCriterion("company_career between", value1, value2, "companyCareer");
            return (Criteria) this;
        }

        public Criteria andCompanyCareerNotBetween(String value1, String value2) {
            addCriterion("company_career not between", value1, value2, "companyCareer");
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