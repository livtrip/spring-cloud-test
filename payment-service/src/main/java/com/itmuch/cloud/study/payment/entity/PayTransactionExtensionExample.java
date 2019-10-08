package com.itmuch.cloud.study.payment.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayTransactionExtensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public PayTransactionExtensionExample() {
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

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdIsNull() {
            addCriterion("pay_method_id is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdIsNotNull() {
            addCriterion("pay_method_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdEqualTo(Integer value) {
            addCriterion("pay_method_id =", value, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdNotEqualTo(Integer value) {
            addCriterion("pay_method_id <>", value, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdGreaterThan(Integer value) {
            addCriterion("pay_method_id >", value, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method_id >=", value, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdLessThan(Integer value) {
            addCriterion("pay_method_id <", value, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method_id <=", value, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdIn(List<Integer> values) {
            addCriterion("pay_method_id in", values, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdNotIn(List<Integer> values) {
            addCriterion("pay_method_id not in", values, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_method_id between", value1, value2, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andPayMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method_id not between", value1, value2, "payMethodId");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeIsNull() {
            addCriterion("transaction_code is null");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeIsNotNull() {
            addCriterion("transaction_code is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeEqualTo(String value) {
            addCriterion("transaction_code =", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeNotEqualTo(String value) {
            addCriterion("transaction_code <>", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeGreaterThan(String value) {
            addCriterion("transaction_code >", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_code >=", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeLessThan(String value) {
            addCriterion("transaction_code <", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeLessThanOrEqualTo(String value) {
            addCriterion("transaction_code <=", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeLike(String value) {
            addCriterion("transaction_code like", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeNotLike(String value) {
            addCriterion("transaction_code not like", value, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeIn(List<String> values) {
            addCriterion("transaction_code in", values, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeNotIn(List<String> values) {
            addCriterion("transaction_code not in", values, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeBetween(String value1, String value2) {
            addCriterion("transaction_code between", value1, value2, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andTransactionCodeNotBetween(String value1, String value2) {
            addCriterion("transaction_code not between", value1, value2, "transactionCode");
            return (Criteria) this;
        }

        public Criteria andCallNumIsNull() {
            addCriterion("call_num is null");
            return (Criteria) this;
        }

        public Criteria andCallNumIsNotNull() {
            addCriterion("call_num is not null");
            return (Criteria) this;
        }

        public Criteria andCallNumEqualTo(Integer value) {
            addCriterion("call_num =", value, "callNum");
            return (Criteria) this;
        }

        public Criteria andCallNumNotEqualTo(Integer value) {
            addCriterion("call_num <>", value, "callNum");
            return (Criteria) this;
        }

        public Criteria andCallNumGreaterThan(Integer value) {
            addCriterion("call_num >", value, "callNum");
            return (Criteria) this;
        }

        public Criteria andCallNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_num >=", value, "callNum");
            return (Criteria) this;
        }

        public Criteria andCallNumLessThan(Integer value) {
            addCriterion("call_num <", value, "callNum");
            return (Criteria) this;
        }

        public Criteria andCallNumLessThanOrEqualTo(Integer value) {
            addCriterion("call_num <=", value, "callNum");
            return (Criteria) this;
        }

        public Criteria andCallNumIn(List<Integer> values) {
            addCriterion("call_num in", values, "callNum");
            return (Criteria) this;
        }

        public Criteria andCallNumNotIn(List<Integer> values) {
            addCriterion("call_num not in", values, "callNum");
            return (Criteria) this;
        }

        public Criteria andCallNumBetween(Integer value1, Integer value2) {
            addCriterion("call_num between", value1, value2, "callNum");
            return (Criteria) this;
        }

        public Criteria andCallNumNotBetween(Integer value1, Integer value2) {
            addCriterion("call_num not between", value1, value2, "callNum");
            return (Criteria) this;
        }

        public Criteria andExtensionDataIsNull() {
            addCriterion("extension_data is null");
            return (Criteria) this;
        }

        public Criteria andExtensionDataIsNotNull() {
            addCriterion("extension_data is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionDataEqualTo(String value) {
            addCriterion("extension_data =", value, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataNotEqualTo(String value) {
            addCriterion("extension_data <>", value, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataGreaterThan(String value) {
            addCriterion("extension_data >", value, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataGreaterThanOrEqualTo(String value) {
            addCriterion("extension_data >=", value, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataLessThan(String value) {
            addCriterion("extension_data <", value, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataLessThanOrEqualTo(String value) {
            addCriterion("extension_data <=", value, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataLike(String value) {
            addCriterion("extension_data like", value, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataNotLike(String value) {
            addCriterion("extension_data not like", value, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataIn(List<String> values) {
            addCriterion("extension_data in", values, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataNotIn(List<String> values) {
            addCriterion("extension_data not in", values, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataBetween(String value1, String value2) {
            addCriterion("extension_data between", value1, value2, "extensionData");
            return (Criteria) this;
        }

        public Criteria andExtensionDataNotBetween(String value1, String value2) {
            addCriterion("extension_data not between", value1, value2, "extensionData");
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

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Byte value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Byte value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Byte value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Byte value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Byte> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Byte> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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