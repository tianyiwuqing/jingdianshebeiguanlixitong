package com.lynu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TableRepertoryOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableRepertoryOutExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsIsNull() {
            addCriterion("repertoryoutbills is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsIsNotNull() {
            addCriterion("repertoryoutbills is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsEqualTo(String value) {
            addCriterion("repertoryoutbills =", value, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsNotEqualTo(String value) {
            addCriterion("repertoryoutbills <>", value, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsGreaterThan(String value) {
            addCriterion("repertoryoutbills >", value, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsGreaterThanOrEqualTo(String value) {
            addCriterion("repertoryoutbills >=", value, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsLessThan(String value) {
            addCriterion("repertoryoutbills <", value, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsLessThanOrEqualTo(String value) {
            addCriterion("repertoryoutbills <=", value, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsLike(String value) {
            addCriterion("repertoryoutbills like", value, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsNotLike(String value) {
            addCriterion("repertoryoutbills not like", value, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsIn(List<String> values) {
            addCriterion("repertoryoutbills in", values, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsNotIn(List<String> values) {
            addCriterion("repertoryoutbills not in", values, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsBetween(String value1, String value2) {
            addCriterion("repertoryoutbills between", value1, value2, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andRepertoryoutbillsNotBetween(String value1, String value2) {
            addCriterion("repertoryoutbills not between", value1, value2, "repertoryoutbills");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeIsNull() {
            addCriterion("equipmentcode is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeIsNotNull() {
            addCriterion("equipmentcode is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeEqualTo(String value) {
            addCriterion("equipmentcode =", value, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeNotEqualTo(String value) {
            addCriterion("equipmentcode <>", value, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeGreaterThan(String value) {
            addCriterion("equipmentcode >", value, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("equipmentcode >=", value, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeLessThan(String value) {
            addCriterion("equipmentcode <", value, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeLessThanOrEqualTo(String value) {
            addCriterion("equipmentcode <=", value, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeLike(String value) {
            addCriterion("equipmentcode like", value, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeNotLike(String value) {
            addCriterion("equipmentcode not like", value, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeIn(List<String> values) {
            addCriterion("equipmentcode in", values, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeNotIn(List<String> values) {
            addCriterion("equipmentcode not in", values, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeBetween(String value1, String value2) {
            addCriterion("equipmentcode between", value1, value2, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andEquipmentcodeNotBetween(String value1, String value2) {
            addCriterion("equipmentcode not between", value1, value2, "equipmentcode");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidIsNull() {
            addCriterion("receivedepartmentid is null");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidIsNotNull() {
            addCriterion("receivedepartmentid is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidEqualTo(String value) {
            addCriterion("receivedepartmentid =", value, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidNotEqualTo(String value) {
            addCriterion("receivedepartmentid <>", value, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidGreaterThan(String value) {
            addCriterion("receivedepartmentid >", value, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("receivedepartmentid >=", value, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidLessThan(String value) {
            addCriterion("receivedepartmentid <", value, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidLessThanOrEqualTo(String value) {
            addCriterion("receivedepartmentid <=", value, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidLike(String value) {
            addCriterion("receivedepartmentid like", value, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidNotLike(String value) {
            addCriterion("receivedepartmentid not like", value, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidIn(List<String> values) {
            addCriterion("receivedepartmentid in", values, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidNotIn(List<String> values) {
            addCriterion("receivedepartmentid not in", values, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidBetween(String value1, String value2) {
            addCriterion("receivedepartmentid between", value1, value2, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceivedepartmentidNotBetween(String value1, String value2) {
            addCriterion("receivedepartmentid not between", value1, value2, "receivedepartmentid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidIsNull() {
            addCriterion("receiveemployeeid is null");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidIsNotNull() {
            addCriterion("receiveemployeeid is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidEqualTo(String value) {
            addCriterion("receiveemployeeid =", value, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidNotEqualTo(String value) {
            addCriterion("receiveemployeeid <>", value, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidGreaterThan(String value) {
            addCriterion("receiveemployeeid >", value, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("receiveemployeeid >=", value, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidLessThan(String value) {
            addCriterion("receiveemployeeid <", value, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidLessThanOrEqualTo(String value) {
            addCriterion("receiveemployeeid <=", value, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidLike(String value) {
            addCriterion("receiveemployeeid like", value, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidNotLike(String value) {
            addCriterion("receiveemployeeid not like", value, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidIn(List<String> values) {
            addCriterion("receiveemployeeid in", values, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidNotIn(List<String> values) {
            addCriterion("receiveemployeeid not in", values, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidBetween(String value1, String value2) {
            addCriterion("receiveemployeeid between", value1, value2, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andReceiveemployeeidNotBetween(String value1, String value2) {
            addCriterion("receiveemployeeid not between", value1, value2, "receiveemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidIsNull() {
            addCriterion("createemployeeid is null");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidIsNotNull() {
            addCriterion("createemployeeid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidEqualTo(String value) {
            addCriterion("createemployeeid =", value, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidNotEqualTo(String value) {
            addCriterion("createemployeeid <>", value, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidGreaterThan(String value) {
            addCriterion("createemployeeid >", value, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("createemployeeid >=", value, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidLessThan(String value) {
            addCriterion("createemployeeid <", value, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidLessThanOrEqualTo(String value) {
            addCriterion("createemployeeid <=", value, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidLike(String value) {
            addCriterion("createemployeeid like", value, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidNotLike(String value) {
            addCriterion("createemployeeid not like", value, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidIn(List<String> values) {
            addCriterion("createemployeeid in", values, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidNotIn(List<String> values) {
            addCriterion("createemployeeid not in", values, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidBetween(String value1, String value2) {
            addCriterion("createemployeeid between", value1, value2, "createemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreateemployeeidNotBetween(String value1, String value2) {
            addCriterion("createemployeeid not between", value1, value2, "createemployeeid");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
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

        public Criteria andCodeabstractIsNull() {
            addCriterion("codeabstract is null");
            return (Criteria) this;
        }

        public Criteria andCodeabstractIsNotNull() {
            addCriterion("codeabstract is not null");
            return (Criteria) this;
        }

        public Criteria andCodeabstractEqualTo(String value) {
            addCriterion("codeabstract =", value, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractNotEqualTo(String value) {
            addCriterion("codeabstract <>", value, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractGreaterThan(String value) {
            addCriterion("codeabstract >", value, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractGreaterThanOrEqualTo(String value) {
            addCriterion("codeabstract >=", value, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractLessThan(String value) {
            addCriterion("codeabstract <", value, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractLessThanOrEqualTo(String value) {
            addCriterion("codeabstract <=", value, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractLike(String value) {
            addCriterion("codeabstract like", value, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractNotLike(String value) {
            addCriterion("codeabstract not like", value, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractIn(List<String> values) {
            addCriterion("codeabstract in", values, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractNotIn(List<String> values) {
            addCriterion("codeabstract not in", values, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractBetween(String value1, String value2) {
            addCriterion("codeabstract between", value1, value2, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andCodeabstractNotBetween(String value1, String value2) {
            addCriterion("codeabstract not between", value1, value2, "codeabstract");
            return (Criteria) this;
        }

        public Criteria andIsDelateIsNull() {
            addCriterion("is_delate is null");
            return (Criteria) this;
        }

        public Criteria andIsDelateIsNotNull() {
            addCriterion("is_delate is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelateEqualTo(Integer value) {
            addCriterion("is_delate =", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateNotEqualTo(Integer value) {
            addCriterion("is_delate <>", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateGreaterThan(Integer value) {
            addCriterion("is_delate >", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delate >=", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateLessThan(Integer value) {
            addCriterion("is_delate <", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateLessThanOrEqualTo(Integer value) {
            addCriterion("is_delate <=", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateIn(List<Integer> values) {
            addCriterion("is_delate in", values, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateNotIn(List<Integer> values) {
            addCriterion("is_delate not in", values, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateBetween(Integer value1, Integer value2) {
            addCriterion("is_delate between", value1, value2, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delate not between", value1, value2, "isDelate");
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