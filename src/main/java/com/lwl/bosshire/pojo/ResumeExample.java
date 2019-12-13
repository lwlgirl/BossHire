package com.lwl.bosshire.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeExample() {
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

        public Criteria andResumeIdIsNull() {
            addCriterion("resume_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Integer value) {
            addCriterion("resume_id =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Integer value) {
            addCriterion("resume_id <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Integer value) {
            addCriterion("resume_id >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resume_id >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Integer value) {
            addCriterion("resume_id <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("resume_id <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Integer> values) {
            addCriterion("resume_id in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Integer> values) {
            addCriterion("resume_id not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Integer value1, Integer value2) {
            addCriterion("resume_id between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resume_id not between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeContentIsNull() {
            addCriterion("resume_content is null");
            return (Criteria) this;
        }

        public Criteria andResumeContentIsNotNull() {
            addCriterion("resume_content is not null");
            return (Criteria) this;
        }

        public Criteria andResumeContentEqualTo(String value) {
            addCriterion("resume_content =", value, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentNotEqualTo(String value) {
            addCriterion("resume_content <>", value, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentGreaterThan(String value) {
            addCriterion("resume_content >", value, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentGreaterThanOrEqualTo(String value) {
            addCriterion("resume_content >=", value, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentLessThan(String value) {
            addCriterion("resume_content <", value, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentLessThanOrEqualTo(String value) {
            addCriterion("resume_content <=", value, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentLike(String value) {
            addCriterion("resume_content like", value, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentNotLike(String value) {
            addCriterion("resume_content not like", value, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentIn(List<String> values) {
            addCriterion("resume_content in", values, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentNotIn(List<String> values) {
            addCriterion("resume_content not in", values, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentBetween(String value1, String value2) {
            addCriterion("resume_content between", value1, value2, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeContentNotBetween(String value1, String value2) {
            addCriterion("resume_content not between", value1, value2, "resumeContent");
            return (Criteria) this;
        }

        public Criteria andResumeUserIsNull() {
            addCriterion("resume_user is null");
            return (Criteria) this;
        }

        public Criteria andResumeUserIsNotNull() {
            addCriterion("resume_user is not null");
            return (Criteria) this;
        }

        public Criteria andResumeUserEqualTo(Integer value) {
            addCriterion("resume_user =", value, "resumeUser");
            return (Criteria) this;
        }

        public Criteria andResumeUserNotEqualTo(Integer value) {
            addCriterion("resume_user <>", value, "resumeUser");
            return (Criteria) this;
        }

        public Criteria andResumeUserGreaterThan(Integer value) {
            addCriterion("resume_user >", value, "resumeUser");
            return (Criteria) this;
        }

        public Criteria andResumeUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("resume_user >=", value, "resumeUser");
            return (Criteria) this;
        }

        public Criteria andResumeUserLessThan(Integer value) {
            addCriterion("resume_user <", value, "resumeUser");
            return (Criteria) this;
        }

        public Criteria andResumeUserLessThanOrEqualTo(Integer value) {
            addCriterion("resume_user <=", value, "resumeUser");
            return (Criteria) this;
        }

        public Criteria andResumeUserIn(List<Integer> values) {
            addCriterion("resume_user in", values, "resumeUser");
            return (Criteria) this;
        }

        public Criteria andResumeUserNotIn(List<Integer> values) {
            addCriterion("resume_user not in", values, "resumeUser");
            return (Criteria) this;
        }

        public Criteria andResumeUserBetween(Integer value1, Integer value2) {
            addCriterion("resume_user between", value1, value2, "resumeUser");
            return (Criteria) this;
        }

        public Criteria andResumeUserNotBetween(Integer value1, Integer value2) {
            addCriterion("resume_user not between", value1, value2, "resumeUser");
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