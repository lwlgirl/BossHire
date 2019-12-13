package com.lwl.bosshire.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDeliveryRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDeliveryRecordExample() {
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

        public Criteria andUserDeliveryRecordIdIsNull() {
            addCriterion("user_delivery_record_id is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdIsNotNull() {
            addCriterion("user_delivery_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdEqualTo(String value) {
            addCriterion("user_delivery_record_id =", value, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdNotEqualTo(String value) {
            addCriterion("user_delivery_record_id <>", value, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdGreaterThan(String value) {
            addCriterion("user_delivery_record_id >", value, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_id >=", value, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdLessThan(String value) {
            addCriterion("user_delivery_record_id <", value, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdLessThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_id <=", value, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdLike(String value) {
            addCriterion("user_delivery_record_id like", value, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdNotLike(String value) {
            addCriterion("user_delivery_record_id not like", value, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdIn(List<String> values) {
            addCriterion("user_delivery_record_id in", values, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdNotIn(List<String> values) {
            addCriterion("user_delivery_record_id not in", values, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdBetween(String value1, String value2) {
            addCriterion("user_delivery_record_id between", value1, value2, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordIdNotBetween(String value1, String value2) {
            addCriterion("user_delivery_record_id not between", value1, value2, "userDeliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserIsNull() {
            addCriterion("user_delivery_record_user is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserIsNotNull() {
            addCriterion("user_delivery_record_user is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserEqualTo(Integer value) {
            addCriterion("user_delivery_record_user =", value, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserNotEqualTo(Integer value) {
            addCriterion("user_delivery_record_user <>", value, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserGreaterThan(Integer value) {
            addCriterion("user_delivery_record_user >", value, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_delivery_record_user >=", value, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserLessThan(Integer value) {
            addCriterion("user_delivery_record_user <", value, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserLessThanOrEqualTo(Integer value) {
            addCriterion("user_delivery_record_user <=", value, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserIn(List<Integer> values) {
            addCriterion("user_delivery_record_user in", values, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserNotIn(List<Integer> values) {
            addCriterion("user_delivery_record_user not in", values, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserBetween(Integer value1, Integer value2) {
            addCriterion("user_delivery_record_user between", value1, value2, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUserNotBetween(Integer value1, Integer value2) {
            addCriterion("user_delivery_record_user not between", value1, value2, "userDeliveryRecordUser");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridIsNull() {
            addCriterion("user_delivery_record_careerId is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridIsNotNull() {
            addCriterion("user_delivery_record_careerId is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridEqualTo(Integer value) {
            addCriterion("user_delivery_record_careerId =", value, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridNotEqualTo(Integer value) {
            addCriterion("user_delivery_record_careerId <>", value, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridGreaterThan(Integer value) {
            addCriterion("user_delivery_record_careerId >", value, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_delivery_record_careerId >=", value, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridLessThan(Integer value) {
            addCriterion("user_delivery_record_careerId <", value, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridLessThanOrEqualTo(Integer value) {
            addCriterion("user_delivery_record_careerId <=", value, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridIn(List<Integer> values) {
            addCriterion("user_delivery_record_careerId in", values, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridNotIn(List<Integer> values) {
            addCriterion("user_delivery_record_careerId not in", values, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridBetween(Integer value1, Integer value2) {
            addCriterion("user_delivery_record_careerId between", value1, value2, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareeridNotBetween(Integer value1, Integer value2) {
            addCriterion("user_delivery_record_careerId not between", value1, value2, "userDeliveryRecordCareerid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateIsNull() {
            addCriterion("user_delivery_record_date is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateIsNotNull() {
            addCriterion("user_delivery_record_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateEqualTo(Date value) {
            addCriterion("user_delivery_record_date =", value, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateNotEqualTo(Date value) {
            addCriterion("user_delivery_record_date <>", value, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateGreaterThan(Date value) {
            addCriterion("user_delivery_record_date >", value, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterion("user_delivery_record_date >=", value, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateLessThan(Date value) {
            addCriterion("user_delivery_record_date <", value, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateLessThanOrEqualTo(Date value) {
            addCriterion("user_delivery_record_date <=", value, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateIn(List<Date> values) {
            addCriterion("user_delivery_record_date in", values, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateNotIn(List<Date> values) {
            addCriterion("user_delivery_record_date not in", values, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateBetween(Date value1, Date value2) {
            addCriterion("user_delivery_record_date between", value1, value2, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordDateNotBetween(Date value1, Date value2) {
            addCriterion("user_delivery_record_date not between", value1, value2, "userDeliveryRecordDate");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusIsNull() {
            addCriterion("user_delivery_record_status is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusIsNotNull() {
            addCriterion("user_delivery_record_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusEqualTo(String value) {
            addCriterion("user_delivery_record_status =", value, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusNotEqualTo(String value) {
            addCriterion("user_delivery_record_status <>", value, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusGreaterThan(String value) {
            addCriterion("user_delivery_record_status >", value, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusGreaterThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_status >=", value, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusLessThan(String value) {
            addCriterion("user_delivery_record_status <", value, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusLessThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_status <=", value, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusLike(String value) {
            addCriterion("user_delivery_record_status like", value, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusNotLike(String value) {
            addCriterion("user_delivery_record_status not like", value, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusIn(List<String> values) {
            addCriterion("user_delivery_record_status in", values, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusNotIn(List<String> values) {
            addCriterion("user_delivery_record_status not in", values, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusBetween(String value1, String value2) {
            addCriterion("user_delivery_record_status between", value1, value2, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordStatusNotBetween(String value1, String value2) {
            addCriterion("user_delivery_record_status not between", value1, value2, "userDeliveryRecordStatus");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameIsNull() {
            addCriterion("user_delivery_record_companyName is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameIsNotNull() {
            addCriterion("user_delivery_record_companyName is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameEqualTo(String value) {
            addCriterion("user_delivery_record_companyName =", value, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameNotEqualTo(String value) {
            addCriterion("user_delivery_record_companyName <>", value, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameGreaterThan(String value) {
            addCriterion("user_delivery_record_companyName >", value, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_companyName >=", value, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameLessThan(String value) {
            addCriterion("user_delivery_record_companyName <", value, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameLessThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_companyName <=", value, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameLike(String value) {
            addCriterion("user_delivery_record_companyName like", value, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameNotLike(String value) {
            addCriterion("user_delivery_record_companyName not like", value, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameIn(List<String> values) {
            addCriterion("user_delivery_record_companyName in", values, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameNotIn(List<String> values) {
            addCriterion("user_delivery_record_companyName not in", values, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameBetween(String value1, String value2) {
            addCriterion("user_delivery_record_companyName between", value1, value2, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanynameNotBetween(String value1, String value2) {
            addCriterion("user_delivery_record_companyName not between", value1, value2, "userDeliveryRecordCompanyname");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameIsNull() {
            addCriterion("user_delivery_record_careerName is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameIsNotNull() {
            addCriterion("user_delivery_record_careerName is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameEqualTo(String value) {
            addCriterion("user_delivery_record_careerName =", value, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameNotEqualTo(String value) {
            addCriterion("user_delivery_record_careerName <>", value, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameGreaterThan(String value) {
            addCriterion("user_delivery_record_careerName >", value, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameGreaterThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_careerName >=", value, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameLessThan(String value) {
            addCriterion("user_delivery_record_careerName <", value, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameLessThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_careerName <=", value, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameLike(String value) {
            addCriterion("user_delivery_record_careerName like", value, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameNotLike(String value) {
            addCriterion("user_delivery_record_careerName not like", value, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameIn(List<String> values) {
            addCriterion("user_delivery_record_careerName in", values, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameNotIn(List<String> values) {
            addCriterion("user_delivery_record_careerName not in", values, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameBetween(String value1, String value2) {
            addCriterion("user_delivery_record_careerName between", value1, value2, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCareernameNotBetween(String value1, String value2) {
            addCriterion("user_delivery_record_careerName not between", value1, value2, "userDeliveryRecordCareername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidIsNull() {
            addCriterion("user_delivery_record_companyId is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidIsNotNull() {
            addCriterion("user_delivery_record_companyId is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidEqualTo(Integer value) {
            addCriterion("user_delivery_record_companyId =", value, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidNotEqualTo(Integer value) {
            addCriterion("user_delivery_record_companyId <>", value, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidGreaterThan(Integer value) {
            addCriterion("user_delivery_record_companyId >", value, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_delivery_record_companyId >=", value, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidLessThan(Integer value) {
            addCriterion("user_delivery_record_companyId <", value, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("user_delivery_record_companyId <=", value, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidIn(List<Integer> values) {
            addCriterion("user_delivery_record_companyId in", values, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidNotIn(List<Integer> values) {
            addCriterion("user_delivery_record_companyId not in", values, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("user_delivery_record_companyId between", value1, value2, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("user_delivery_record_companyId not between", value1, value2, "userDeliveryRecordCompanyid");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameIsNull() {
            addCriterion("user_delivery_record_userName is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameIsNotNull() {
            addCriterion("user_delivery_record_userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameEqualTo(String value) {
            addCriterion("user_delivery_record_userName =", value, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameNotEqualTo(String value) {
            addCriterion("user_delivery_record_userName <>", value, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameGreaterThan(String value) {
            addCriterion("user_delivery_record_userName >", value, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_userName >=", value, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameLessThan(String value) {
            addCriterion("user_delivery_record_userName <", value, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameLessThanOrEqualTo(String value) {
            addCriterion("user_delivery_record_userName <=", value, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameLike(String value) {
            addCriterion("user_delivery_record_userName like", value, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameNotLike(String value) {
            addCriterion("user_delivery_record_userName not like", value, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameIn(List<String> values) {
            addCriterion("user_delivery_record_userName in", values, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameNotIn(List<String> values) {
            addCriterion("user_delivery_record_userName not in", values, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameBetween(String value1, String value2) {
            addCriterion("user_delivery_record_userName between", value1, value2, "userDeliveryRecordUsername");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryRecordUsernameNotBetween(String value1, String value2) {
            addCriterion("user_delivery_record_userName not between", value1, value2, "userDeliveryRecordUsername");
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