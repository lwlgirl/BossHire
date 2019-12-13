package com.lwl.bosshire.pojo;

import java.util.ArrayList;
import java.util.List;

public class CareerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CareerExample() {
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

        public Criteria andCareerIdIsNull() {
            addCriterion("career_id is null");
            return (Criteria) this;
        }

        public Criteria andCareerIdIsNotNull() {
            addCriterion("career_id is not null");
            return (Criteria) this;
        }

        public Criteria andCareerIdEqualTo(Integer value) {
            addCriterion("career_id =", value, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerIdNotEqualTo(Integer value) {
            addCriterion("career_id <>", value, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerIdGreaterThan(Integer value) {
            addCriterion("career_id >", value, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("career_id >=", value, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerIdLessThan(Integer value) {
            addCriterion("career_id <", value, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerIdLessThanOrEqualTo(Integer value) {
            addCriterion("career_id <=", value, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerIdIn(List<Integer> values) {
            addCriterion("career_id in", values, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerIdNotIn(List<Integer> values) {
            addCriterion("career_id not in", values, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerIdBetween(Integer value1, Integer value2) {
            addCriterion("career_id between", value1, value2, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("career_id not between", value1, value2, "careerId");
            return (Criteria) this;
        }

        public Criteria andCareerNameIsNull() {
            addCriterion("career_name is null");
            return (Criteria) this;
        }

        public Criteria andCareerNameIsNotNull() {
            addCriterion("career_name is not null");
            return (Criteria) this;
        }

        public Criteria andCareerNameEqualTo(String value) {
            addCriterion("career_name =", value, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameNotEqualTo(String value) {
            addCriterion("career_name <>", value, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameGreaterThan(String value) {
            addCriterion("career_name >", value, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameGreaterThanOrEqualTo(String value) {
            addCriterion("career_name >=", value, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameLessThan(String value) {
            addCriterion("career_name <", value, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameLessThanOrEqualTo(String value) {
            addCriterion("career_name <=", value, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameLike(String value) {
            addCriterion("career_name like", value, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameNotLike(String value) {
            addCriterion("career_name not like", value, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameIn(List<String> values) {
            addCriterion("career_name in", values, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameNotIn(List<String> values) {
            addCriterion("career_name not in", values, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameBetween(String value1, String value2) {
            addCriterion("career_name between", value1, value2, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerNameNotBetween(String value1, String value2) {
            addCriterion("career_name not between", value1, value2, "careerName");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeIsNull() {
            addCriterion("career_describe is null");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeIsNotNull() {
            addCriterion("career_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeEqualTo(String value) {
            addCriterion("career_describe =", value, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeNotEqualTo(String value) {
            addCriterion("career_describe <>", value, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeGreaterThan(String value) {
            addCriterion("career_describe >", value, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("career_describe >=", value, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeLessThan(String value) {
            addCriterion("career_describe <", value, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeLessThanOrEqualTo(String value) {
            addCriterion("career_describe <=", value, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeLike(String value) {
            addCriterion("career_describe like", value, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeNotLike(String value) {
            addCriterion("career_describe not like", value, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeIn(List<String> values) {
            addCriterion("career_describe in", values, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeNotIn(List<String> values) {
            addCriterion("career_describe not in", values, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeBetween(String value1, String value2) {
            addCriterion("career_describe between", value1, value2, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerDescribeNotBetween(String value1, String value2) {
            addCriterion("career_describe not between", value1, value2, "careerDescribe");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementIsNull() {
            addCriterion("career_requirement is null");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementIsNotNull() {
            addCriterion("career_requirement is not null");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementEqualTo(String value) {
            addCriterion("career_requirement =", value, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementNotEqualTo(String value) {
            addCriterion("career_requirement <>", value, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementGreaterThan(String value) {
            addCriterion("career_requirement >", value, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("career_requirement >=", value, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementLessThan(String value) {
            addCriterion("career_requirement <", value, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementLessThanOrEqualTo(String value) {
            addCriterion("career_requirement <=", value, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementLike(String value) {
            addCriterion("career_requirement like", value, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementNotLike(String value) {
            addCriterion("career_requirement not like", value, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementIn(List<String> values) {
            addCriterion("career_requirement in", values, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementNotIn(List<String> values) {
            addCriterion("career_requirement not in", values, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementBetween(String value1, String value2) {
            addCriterion("career_requirement between", value1, value2, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerRequirementNotBetween(String value1, String value2) {
            addCriterion("career_requirement not between", value1, value2, "careerRequirement");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinIsNull() {
            addCriterion("career_salary_min is null");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinIsNotNull() {
            addCriterion("career_salary_min is not null");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinEqualTo(Integer value) {
            addCriterion("career_salary_min =", value, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinNotEqualTo(Integer value) {
            addCriterion("career_salary_min <>", value, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinGreaterThan(Integer value) {
            addCriterion("career_salary_min >", value, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("career_salary_min >=", value, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinLessThan(Integer value) {
            addCriterion("career_salary_min <", value, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinLessThanOrEqualTo(Integer value) {
            addCriterion("career_salary_min <=", value, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinIn(List<Integer> values) {
            addCriterion("career_salary_min in", values, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinNotIn(List<Integer> values) {
            addCriterion("career_salary_min not in", values, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinBetween(Integer value1, Integer value2) {
            addCriterion("career_salary_min between", value1, value2, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMinNotBetween(Integer value1, Integer value2) {
            addCriterion("career_salary_min not between", value1, value2, "careerSalaryMin");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxIsNull() {
            addCriterion("career_salary_max is null");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxIsNotNull() {
            addCriterion("career_salary_max is not null");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxEqualTo(Integer value) {
            addCriterion("career_salary_max =", value, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxNotEqualTo(Integer value) {
            addCriterion("career_salary_max <>", value, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxGreaterThan(Integer value) {
            addCriterion("career_salary_max >", value, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("career_salary_max >=", value, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxLessThan(Integer value) {
            addCriterion("career_salary_max <", value, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxLessThanOrEqualTo(Integer value) {
            addCriterion("career_salary_max <=", value, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxIn(List<Integer> values) {
            addCriterion("career_salary_max in", values, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxNotIn(List<Integer> values) {
            addCriterion("career_salary_max not in", values, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxBetween(Integer value1, Integer value2) {
            addCriterion("career_salary_max between", value1, value2, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerSalaryMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("career_salary_max not between", value1, value2, "careerSalaryMax");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyIsNull() {
            addCriterion("career_company is null");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyIsNotNull() {
            addCriterion("career_company is not null");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyEqualTo(Integer value) {
            addCriterion("career_company =", value, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyNotEqualTo(Integer value) {
            addCriterion("career_company <>", value, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyGreaterThan(Integer value) {
            addCriterion("career_company >", value, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("career_company >=", value, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyLessThan(Integer value) {
            addCriterion("career_company <", value, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("career_company <=", value, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyIn(List<Integer> values) {
            addCriterion("career_company in", values, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyNotIn(List<Integer> values) {
            addCriterion("career_company not in", values, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyBetween(Integer value1, Integer value2) {
            addCriterion("career_company between", value1, value2, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("career_company not between", value1, value2, "careerCompany");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageIsNull() {
            addCriterion("career_advantage is null");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageIsNotNull() {
            addCriterion("career_advantage is not null");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageEqualTo(String value) {
            addCriterion("career_advantage =", value, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageNotEqualTo(String value) {
            addCriterion("career_advantage <>", value, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageGreaterThan(String value) {
            addCriterion("career_advantage >", value, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageGreaterThanOrEqualTo(String value) {
            addCriterion("career_advantage >=", value, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageLessThan(String value) {
            addCriterion("career_advantage <", value, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageLessThanOrEqualTo(String value) {
            addCriterion("career_advantage <=", value, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageLike(String value) {
            addCriterion("career_advantage like", value, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageNotLike(String value) {
            addCriterion("career_advantage not like", value, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageIn(List<String> values) {
            addCriterion("career_advantage in", values, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageNotIn(List<String> values) {
            addCriterion("career_advantage not in", values, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageBetween(String value1, String value2) {
            addCriterion("career_advantage between", value1, value2, "careerAdvantage");
            return (Criteria) this;
        }

        public Criteria andCareerAdvantageNotBetween(String value1, String value2) {
            addCriterion("career_advantage not between", value1, value2, "careerAdvantage");
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