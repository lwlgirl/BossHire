package com.lwl.bosshire.pojo;

import java.util.ArrayList;
import java.util.List;

public class JobApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobApplyExample() {
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

        public Criteria andJaIdIsNull() {
            addCriterion("ja_id is null");
            return (Criteria) this;
        }

        public Criteria andJaIdIsNotNull() {
            addCriterion("ja_id is not null");
            return (Criteria) this;
        }

        public Criteria andJaIdEqualTo(Integer value) {
            addCriterion("ja_id =", value, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaIdNotEqualTo(Integer value) {
            addCriterion("ja_id <>", value, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaIdGreaterThan(Integer value) {
            addCriterion("ja_id >", value, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ja_id >=", value, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaIdLessThan(Integer value) {
            addCriterion("ja_id <", value, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaIdLessThanOrEqualTo(Integer value) {
            addCriterion("ja_id <=", value, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaIdIn(List<Integer> values) {
            addCriterion("ja_id in", values, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaIdNotIn(List<Integer> values) {
            addCriterion("ja_id not in", values, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaIdBetween(Integer value1, Integer value2) {
            addCriterion("ja_id between", value1, value2, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ja_id not between", value1, value2, "jaId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdIsNull() {
            addCriterion("ja_company_id is null");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdIsNotNull() {
            addCriterion("ja_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdEqualTo(Integer value) {
            addCriterion("ja_company_id =", value, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdNotEqualTo(Integer value) {
            addCriterion("ja_company_id <>", value, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdGreaterThan(Integer value) {
            addCriterion("ja_company_id >", value, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ja_company_id >=", value, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdLessThan(Integer value) {
            addCriterion("ja_company_id <", value, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ja_company_id <=", value, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdIn(List<Integer> values) {
            addCriterion("ja_company_id in", values, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdNotIn(List<Integer> values) {
            addCriterion("ja_company_id not in", values, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("ja_company_id between", value1, value2, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ja_company_id not between", value1, value2, "jaCompanyId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdIsNull() {
            addCriterion("ja_cv_id is null");
            return (Criteria) this;
        }

        public Criteria andJaCvIdIsNotNull() {
            addCriterion("ja_cv_id is not null");
            return (Criteria) this;
        }

        public Criteria andJaCvIdEqualTo(Integer value) {
            addCriterion("ja_cv_id =", value, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdNotEqualTo(Integer value) {
            addCriterion("ja_cv_id <>", value, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdGreaterThan(Integer value) {
            addCriterion("ja_cv_id >", value, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ja_cv_id >=", value, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdLessThan(Integer value) {
            addCriterion("ja_cv_id <", value, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdLessThanOrEqualTo(Integer value) {
            addCriterion("ja_cv_id <=", value, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdIn(List<Integer> values) {
            addCriterion("ja_cv_id in", values, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdNotIn(List<Integer> values) {
            addCriterion("ja_cv_id not in", values, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdBetween(Integer value1, Integer value2) {
            addCriterion("ja_cv_id between", value1, value2, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaCvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ja_cv_id not between", value1, value2, "jaCvId");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidIsNull() {
            addCriterion("ja_deliverer_uid is null");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidIsNotNull() {
            addCriterion("ja_deliverer_uid is not null");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidEqualTo(Integer value) {
            addCriterion("ja_deliverer_uid =", value, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidNotEqualTo(Integer value) {
            addCriterion("ja_deliverer_uid <>", value, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidGreaterThan(Integer value) {
            addCriterion("ja_deliverer_uid >", value, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ja_deliverer_uid >=", value, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidLessThan(Integer value) {
            addCriterion("ja_deliverer_uid <", value, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidLessThanOrEqualTo(Integer value) {
            addCriterion("ja_deliverer_uid <=", value, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidIn(List<Integer> values) {
            addCriterion("ja_deliverer_uid in", values, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidNotIn(List<Integer> values) {
            addCriterion("ja_deliverer_uid not in", values, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidBetween(Integer value1, Integer value2) {
            addCriterion("ja_deliverer_uid between", value1, value2, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaDelivererUidNotBetween(Integer value1, Integer value2) {
            addCriterion("ja_deliverer_uid not between", value1, value2, "jaDelivererUid");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeIsNull() {
            addCriterion("ja_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeIsNotNull() {
            addCriterion("ja_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeEqualTo(Integer value) {
            addCriterion("ja_submit_time =", value, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeNotEqualTo(Integer value) {
            addCriterion("ja_submit_time <>", value, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeGreaterThan(Integer value) {
            addCriterion("ja_submit_time >", value, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ja_submit_time >=", value, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeLessThan(Integer value) {
            addCriterion("ja_submit_time <", value, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ja_submit_time <=", value, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeIn(List<Integer> values) {
            addCriterion("ja_submit_time in", values, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeNotIn(List<Integer> values) {
            addCriterion("ja_submit_time not in", values, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeBetween(Integer value1, Integer value2) {
            addCriterion("ja_submit_time between", value1, value2, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaSubmitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ja_submit_time not between", value1, value2, "jaSubmitTime");
            return (Criteria) this;
        }

        public Criteria andJaStatusIsNull() {
            addCriterion("ja_status is null");
            return (Criteria) this;
        }

        public Criteria andJaStatusIsNotNull() {
            addCriterion("ja_status is not null");
            return (Criteria) this;
        }

        public Criteria andJaStatusEqualTo(Integer value) {
            addCriterion("ja_status =", value, "jaStatus");
            return (Criteria) this;
        }

        public Criteria andJaStatusNotEqualTo(Integer value) {
            addCriterion("ja_status <>", value, "jaStatus");
            return (Criteria) this;
        }

        public Criteria andJaStatusGreaterThan(Integer value) {
            addCriterion("ja_status >", value, "jaStatus");
            return (Criteria) this;
        }

        public Criteria andJaStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ja_status >=", value, "jaStatus");
            return (Criteria) this;
        }

        public Criteria andJaStatusLessThan(Integer value) {
            addCriterion("ja_status <", value, "jaStatus");
            return (Criteria) this;
        }

        public Criteria andJaStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ja_status <=", value, "jaStatus");
            return (Criteria) this;
        }

        public Criteria andJaStatusIn(List<Integer> values) {
            addCriterion("ja_status in", values, "jaStatus");
            return (Criteria) this;
        }

        public Criteria andJaStatusNotIn(List<Integer> values) {
            addCriterion("ja_status not in", values, "jaStatus");
            return (Criteria) this;
        }

        public Criteria andJaStatusBetween(Integer value1, Integer value2) {
            addCriterion("ja_status between", value1, value2, "jaStatus");
            return (Criteria) this;
        }

        public Criteria andJaStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ja_status not between", value1, value2, "jaStatus");
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