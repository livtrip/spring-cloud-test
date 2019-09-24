package com.itmuch.cloud.study.coupon.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public CouponDOExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOffDefineIsNull() {
            addCriterion("off_define is null");
            return (Criteria) this;
        }

        public Criteria andOffDefineIsNotNull() {
            addCriterion("off_define is not null");
            return (Criteria) this;
        }

        public Criteria andOffDefineEqualTo(String value) {
            addCriterion("off_define =", value, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineNotEqualTo(String value) {
            addCriterion("off_define <>", value, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineGreaterThan(String value) {
            addCriterion("off_define >", value, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineGreaterThanOrEqualTo(String value) {
            addCriterion("off_define >=", value, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineLessThan(String value) {
            addCriterion("off_define <", value, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineLessThanOrEqualTo(String value) {
            addCriterion("off_define <=", value, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineLike(String value) {
            addCriterion("off_define like", value, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineNotLike(String value) {
            addCriterion("off_define not like", value, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineIn(List<String> values) {
            addCriterion("off_define in", values, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineNotIn(List<String> values) {
            addCriterion("off_define not in", values, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineBetween(String value1, String value2) {
            addCriterion("off_define between", value1, value2, "offDefine");
            return (Criteria) this;
        }

        public Criteria andOffDefineNotBetween(String value1, String value2) {
            addCriterion("off_define not between", value1, value2, "offDefine");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andRandomDefineIsNull() {
            addCriterion("random_define is null");
            return (Criteria) this;
        }

        public Criteria andRandomDefineIsNotNull() {
            addCriterion("random_define is not null");
            return (Criteria) this;
        }

        public Criteria andRandomDefineEqualTo(String value) {
            addCriterion("random_define =", value, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineNotEqualTo(String value) {
            addCriterion("random_define <>", value, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineGreaterThan(String value) {
            addCriterion("random_define >", value, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineGreaterThanOrEqualTo(String value) {
            addCriterion("random_define >=", value, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineLessThan(String value) {
            addCriterion("random_define <", value, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineLessThanOrEqualTo(String value) {
            addCriterion("random_define <=", value, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineLike(String value) {
            addCriterion("random_define like", value, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineNotLike(String value) {
            addCriterion("random_define not like", value, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineIn(List<String> values) {
            addCriterion("random_define in", values, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineNotIn(List<String> values) {
            addCriterion("random_define not in", values, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineBetween(String value1, String value2) {
            addCriterion("random_define between", value1, value2, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andRandomDefineNotBetween(String value1, String value2) {
            addCriterion("random_define not between", value1, value2, "randomDefine");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(Integer value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(Integer value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(Integer value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(Integer value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(Integer value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<Integer> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<Integer> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(Integer value1, Integer value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNull() {
            addCriterion("cycle_unit is null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNotNull() {
            addCriterion("cycle_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitEqualTo(Integer value) {
            addCriterion("cycle_unit =", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotEqualTo(Integer value) {
            addCriterion("cycle_unit <>", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThan(Integer value) {
            addCriterion("cycle_unit >", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_unit >=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThan(Integer value) {
            addCriterion("cycle_unit <", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_unit <=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIn(List<Integer> values) {
            addCriterion("cycle_unit in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotIn(List<Integer> values) {
            addCriterion("cycle_unit not in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitBetween(Integer value1, Integer value2) {
            addCriterion("cycle_unit between", value1, value2, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_unit not between", value1, value2, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIsNull() {
            addCriterion("apply_area is null");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIsNotNull() {
            addCriterion("apply_area is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAreaEqualTo(String value) {
            addCriterion("apply_area =", value, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaNotEqualTo(String value) {
            addCriterion("apply_area <>", value, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaGreaterThan(String value) {
            addCriterion("apply_area >", value, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaGreaterThanOrEqualTo(String value) {
            addCriterion("apply_area >=", value, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaLessThan(String value) {
            addCriterion("apply_area <", value, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaLessThanOrEqualTo(String value) {
            addCriterion("apply_area <=", value, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaLike(String value) {
            addCriterion("apply_area like", value, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaNotLike(String value) {
            addCriterion("apply_area not like", value, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIn(List<String> values) {
            addCriterion("apply_area in", values, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaNotIn(List<String> values) {
            addCriterion("apply_area not in", values, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaBetween(String value1, String value2) {
            addCriterion("apply_area between", value1, value2, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyAreaNotBetween(String value1, String value2) {
            addCriterion("apply_area not between", value1, value2, "applyArea");
            return (Criteria) this;
        }

        public Criteria andApplyStoreIsNull() {
            addCriterion("apply_store is null");
            return (Criteria) this;
        }

        public Criteria andApplyStoreIsNotNull() {
            addCriterion("apply_store is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStoreEqualTo(String value) {
            addCriterion("apply_store =", value, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreNotEqualTo(String value) {
            addCriterion("apply_store <>", value, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreGreaterThan(String value) {
            addCriterion("apply_store >", value, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreGreaterThanOrEqualTo(String value) {
            addCriterion("apply_store >=", value, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreLessThan(String value) {
            addCriterion("apply_store <", value, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreLessThanOrEqualTo(String value) {
            addCriterion("apply_store <=", value, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreLike(String value) {
            addCriterion("apply_store like", value, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreNotLike(String value) {
            addCriterion("apply_store not like", value, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreIn(List<String> values) {
            addCriterion("apply_store in", values, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreNotIn(List<String> values) {
            addCriterion("apply_store not in", values, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreBetween(String value1, String value2) {
            addCriterion("apply_store between", value1, value2, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyStoreNotBetween(String value1, String value2) {
            addCriterion("apply_store not between", value1, value2, "applyStore");
            return (Criteria) this;
        }

        public Criteria andApplyBrandIsNull() {
            addCriterion("apply_brand is null");
            return (Criteria) this;
        }

        public Criteria andApplyBrandIsNotNull() {
            addCriterion("apply_brand is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBrandEqualTo(String value) {
            addCriterion("apply_brand =", value, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandNotEqualTo(String value) {
            addCriterion("apply_brand <>", value, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandGreaterThan(String value) {
            addCriterion("apply_brand >", value, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandGreaterThanOrEqualTo(String value) {
            addCriterion("apply_brand >=", value, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandLessThan(String value) {
            addCriterion("apply_brand <", value, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandLessThanOrEqualTo(String value) {
            addCriterion("apply_brand <=", value, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandLike(String value) {
            addCriterion("apply_brand like", value, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandNotLike(String value) {
            addCriterion("apply_brand not like", value, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandIn(List<String> values) {
            addCriterion("apply_brand in", values, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandNotIn(List<String> values) {
            addCriterion("apply_brand not in", values, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandBetween(String value1, String value2) {
            addCriterion("apply_brand between", value1, value2, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyBrandNotBetween(String value1, String value2) {
            addCriterion("apply_brand not between", value1, value2, "applyBrand");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryIsNull() {
            addCriterion("apply_first_category is null");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryIsNotNull() {
            addCriterion("apply_first_category is not null");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryEqualTo(String value) {
            addCriterion("apply_first_category =", value, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryNotEqualTo(String value) {
            addCriterion("apply_first_category <>", value, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryGreaterThan(String value) {
            addCriterion("apply_first_category >", value, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("apply_first_category >=", value, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryLessThan(String value) {
            addCriterion("apply_first_category <", value, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryLessThanOrEqualTo(String value) {
            addCriterion("apply_first_category <=", value, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryLike(String value) {
            addCriterion("apply_first_category like", value, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryNotLike(String value) {
            addCriterion("apply_first_category not like", value, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryIn(List<String> values) {
            addCriterion("apply_first_category in", values, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryNotIn(List<String> values) {
            addCriterion("apply_first_category not in", values, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryBetween(String value1, String value2) {
            addCriterion("apply_first_category between", value1, value2, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplyFirstCategoryNotBetween(String value1, String value2) {
            addCriterion("apply_first_category not between", value1, value2, "applyFirstCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryIsNull() {
            addCriterion("apply_second_category is null");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryIsNotNull() {
            addCriterion("apply_second_category is not null");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryEqualTo(String value) {
            addCriterion("apply_second_category =", value, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryNotEqualTo(String value) {
            addCriterion("apply_second_category <>", value, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryGreaterThan(String value) {
            addCriterion("apply_second_category >", value, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("apply_second_category >=", value, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryLessThan(String value) {
            addCriterion("apply_second_category <", value, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryLessThanOrEqualTo(String value) {
            addCriterion("apply_second_category <=", value, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryLike(String value) {
            addCriterion("apply_second_category like", value, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryNotLike(String value) {
            addCriterion("apply_second_category not like", value, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryIn(List<String> values) {
            addCriterion("apply_second_category in", values, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryNotIn(List<String> values) {
            addCriterion("apply_second_category not in", values, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryBetween(String value1, String value2) {
            addCriterion("apply_second_category between", value1, value2, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andApplySecondCategoryNotBetween(String value1, String value2) {
            addCriterion("apply_second_category not between", value1, value2, "applySecondCategory");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andObtainRuleIsNull() {
            addCriterion("obtain_rule is null");
            return (Criteria) this;
        }

        public Criteria andObtainRuleIsNotNull() {
            addCriterion("obtain_rule is not null");
            return (Criteria) this;
        }

        public Criteria andObtainRuleEqualTo(String value) {
            addCriterion("obtain_rule =", value, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleNotEqualTo(String value) {
            addCriterion("obtain_rule <>", value, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleGreaterThan(String value) {
            addCriterion("obtain_rule >", value, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleGreaterThanOrEqualTo(String value) {
            addCriterion("obtain_rule >=", value, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleLessThan(String value) {
            addCriterion("obtain_rule <", value, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleLessThanOrEqualTo(String value) {
            addCriterion("obtain_rule <=", value, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleLike(String value) {
            addCriterion("obtain_rule like", value, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleNotLike(String value) {
            addCriterion("obtain_rule not like", value, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleIn(List<String> values) {
            addCriterion("obtain_rule in", values, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleNotIn(List<String> values) {
            addCriterion("obtain_rule not in", values, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleBetween(String value1, String value2) {
            addCriterion("obtain_rule between", value1, value2, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andObtainRuleNotBetween(String value1, String value2) {
            addCriterion("obtain_rule not between", value1, value2, "obtainRule");
            return (Criteria) this;
        }

        public Criteria andNumberLimitIsNull() {
            addCriterion("number_limit is null");
            return (Criteria) this;
        }

        public Criteria andNumberLimitIsNotNull() {
            addCriterion("number_limit is not null");
            return (Criteria) this;
        }

        public Criteria andNumberLimitEqualTo(Integer value) {
            addCriterion("number_limit =", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitNotEqualTo(Integer value) {
            addCriterion("number_limit <>", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitGreaterThan(Integer value) {
            addCriterion("number_limit >", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_limit >=", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitLessThan(Integer value) {
            addCriterion("number_limit <", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitLessThanOrEqualTo(Integer value) {
            addCriterion("number_limit <=", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitIn(List<Integer> values) {
            addCriterion("number_limit in", values, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitNotIn(List<Integer> values) {
            addCriterion("number_limit not in", values, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitBetween(Integer value1, Integer value2) {
            addCriterion("number_limit between", value1, value2, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("number_limit not between", value1, value2, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyIsNull() {
            addCriterion("refund_policy is null");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyIsNotNull() {
            addCriterion("refund_policy is not null");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyEqualTo(Integer value) {
            addCriterion("refund_policy =", value, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyNotEqualTo(Integer value) {
            addCriterion("refund_policy <>", value, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyGreaterThan(Integer value) {
            addCriterion("refund_policy >", value, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_policy >=", value, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyLessThan(Integer value) {
            addCriterion("refund_policy <", value, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyLessThanOrEqualTo(Integer value) {
            addCriterion("refund_policy <=", value, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyIn(List<Integer> values) {
            addCriterion("refund_policy in", values, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyNotIn(List<Integer> values) {
            addCriterion("refund_policy not in", values, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyBetween(Integer value1, Integer value2) {
            addCriterion("refund_policy between", value1, value2, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundPolicyNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_policy not between", value1, value2, "refundPolicy");
            return (Criteria) this;
        }

        public Criteria andPointCostIsNull() {
            addCriterion("point_cost is null");
            return (Criteria) this;
        }

        public Criteria andPointCostIsNotNull() {
            addCriterion("point_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPointCostEqualTo(Integer value) {
            addCriterion("point_cost =", value, "pointCost");
            return (Criteria) this;
        }

        public Criteria andPointCostNotEqualTo(Integer value) {
            addCriterion("point_cost <>", value, "pointCost");
            return (Criteria) this;
        }

        public Criteria andPointCostGreaterThan(Integer value) {
            addCriterion("point_cost >", value, "pointCost");
            return (Criteria) this;
        }

        public Criteria andPointCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_cost >=", value, "pointCost");
            return (Criteria) this;
        }

        public Criteria andPointCostLessThan(Integer value) {
            addCriterion("point_cost <", value, "pointCost");
            return (Criteria) this;
        }

        public Criteria andPointCostLessThanOrEqualTo(Integer value) {
            addCriterion("point_cost <=", value, "pointCost");
            return (Criteria) this;
        }

        public Criteria andPointCostIn(List<Integer> values) {
            addCriterion("point_cost in", values, "pointCost");
            return (Criteria) this;
        }

        public Criteria andPointCostNotIn(List<Integer> values) {
            addCriterion("point_cost not in", values, "pointCost");
            return (Criteria) this;
        }

        public Criteria andPointCostBetween(Integer value1, Integer value2) {
            addCriterion("point_cost between", value1, value2, "pointCost");
            return (Criteria) this;
        }

        public Criteria andPointCostNotBetween(Integer value1, Integer value2) {
            addCriterion("point_cost not between", value1, value2, "pointCost");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberIsNull() {
            addCriterion("exchange_code_number is null");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberIsNotNull() {
            addCriterion("exchange_code_number is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberEqualTo(Integer value) {
            addCriterion("exchange_code_number =", value, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberNotEqualTo(Integer value) {
            addCriterion("exchange_code_number <>", value, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberGreaterThan(Integer value) {
            addCriterion("exchange_code_number >", value, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_code_number >=", value, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberLessThan(Integer value) {
            addCriterion("exchange_code_number <", value, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_code_number <=", value, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberIn(List<Integer> values) {
            addCriterion("exchange_code_number in", values, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberNotIn(List<Integer> values) {
            addCriterion("exchange_code_number not in", values, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberBetween(Integer value1, Integer value2) {
            addCriterion("exchange_code_number between", value1, value2, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeCodeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_code_number not between", value1, value2, "exchangeCodeNumber");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNull() {
            addCriterion("create_person is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNotNull() {
            addCriterion("create_person is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonEqualTo(String value) {
            addCriterion("create_person =", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotEqualTo(String value) {
            addCriterion("create_person <>", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThan(String value) {
            addCriterion("create_person >", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("create_person >=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThan(String value) {
            addCriterion("create_person <", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThanOrEqualTo(String value) {
            addCriterion("create_person <=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLike(String value) {
            addCriterion("create_person like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotLike(String value) {
            addCriterion("create_person not like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIn(List<String> values) {
            addCriterion("create_person in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotIn(List<String> values) {
            addCriterion("create_person not in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonBetween(String value1, String value2) {
            addCriterion("create_person between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotBetween(String value1, String value2) {
            addCriterion("create_person not between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIsNull() {
            addCriterion("update_person is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIsNotNull() {
            addCriterion("update_person is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonEqualTo(String value) {
            addCriterion("update_person =", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNotEqualTo(String value) {
            addCriterion("update_person <>", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonGreaterThan(String value) {
            addCriterion("update_person >", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("update_person >=", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonLessThan(String value) {
            addCriterion("update_person <", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonLessThanOrEqualTo(String value) {
            addCriterion("update_person <=", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonLike(String value) {
            addCriterion("update_person like", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNotLike(String value) {
            addCriterion("update_person not like", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIn(List<String> values) {
            addCriterion("update_person in", values, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNotIn(List<String> values) {
            addCriterion("update_person not in", values, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonBetween(String value1, String value2) {
            addCriterion("update_person between", value1, value2, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNotBetween(String value1, String value2) {
            addCriterion("update_person not between", value1, value2, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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