package com.gy612.loan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoopBusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoopBusinessExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoIsNull() {
            addCriterion("business_info is null");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoIsNotNull() {
            addCriterion("business_info is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoEqualTo(String value) {
            addCriterion("business_info =", value, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoNotEqualTo(String value) {
            addCriterion("business_info <>", value, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoGreaterThan(String value) {
            addCriterion("business_info >", value, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoGreaterThanOrEqualTo(String value) {
            addCriterion("business_info >=", value, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoLessThan(String value) {
            addCriterion("business_info <", value, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoLessThanOrEqualTo(String value) {
            addCriterion("business_info <=", value, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoLike(String value) {
            addCriterion("business_info like", value, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoNotLike(String value) {
            addCriterion("business_info not like", value, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoIn(List<String> values) {
            addCriterion("business_info in", values, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoNotIn(List<String> values) {
            addCriterion("business_info not in", values, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoBetween(String value1, String value2) {
            addCriterion("business_info between", value1, value2, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessInfoNotBetween(String value1, String value2) {
            addCriterion("business_info not between", value1, value2, "businessInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessImgIsNull() {
            addCriterion("business_img is null");
            return (Criteria) this;
        }

        public Criteria andBusinessImgIsNotNull() {
            addCriterion("business_img is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessImgEqualTo(String value) {
            addCriterion("business_img =", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgNotEqualTo(String value) {
            addCriterion("business_img <>", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgGreaterThan(String value) {
            addCriterion("business_img >", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgGreaterThanOrEqualTo(String value) {
            addCriterion("business_img >=", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgLessThan(String value) {
            addCriterion("business_img <", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgLessThanOrEqualTo(String value) {
            addCriterion("business_img <=", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgLike(String value) {
            addCriterion("business_img like", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgNotLike(String value) {
            addCriterion("business_img not like", value, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgIn(List<String> values) {
            addCriterion("business_img in", values, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgNotIn(List<String> values) {
            addCriterion("business_img not in", values, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgBetween(String value1, String value2) {
            addCriterion("business_img between", value1, value2, "businessImg");
            return (Criteria) this;
        }

        public Criteria andBusinessImgNotBetween(String value1, String value2) {
            addCriterion("business_img not between", value1, value2, "businessImg");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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