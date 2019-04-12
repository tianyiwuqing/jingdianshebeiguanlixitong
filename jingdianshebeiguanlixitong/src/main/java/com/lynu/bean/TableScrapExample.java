package com.lynu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TableScrapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableScrapExample() {
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

        public Criteria andScrapbillsIsNull() {
            addCriterion("scrapbills is null");
            return (Criteria) this;
        }

        public Criteria andScrapbillsIsNotNull() {
            addCriterion("scrapbills is not null");
            return (Criteria) this;
        }

        public Criteria andScrapbillsEqualTo(String value) {
            addCriterion("scrapbills =", value, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsNotEqualTo(String value) {
            addCriterion("scrapbills <>", value, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsGreaterThan(String value) {
            addCriterion("scrapbills >", value, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsGreaterThanOrEqualTo(String value) {
            addCriterion("scrapbills >=", value, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsLessThan(String value) {
            addCriterion("scrapbills <", value, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsLessThanOrEqualTo(String value) {
            addCriterion("scrapbills <=", value, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsLike(String value) {
            addCriterion("scrapbills like", value, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsNotLike(String value) {
            addCriterion("scrapbills not like", value, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsIn(List<String> values) {
            addCriterion("scrapbills in", values, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsNotIn(List<String> values) {
            addCriterion("scrapbills not in", values, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsBetween(String value1, String value2) {
            addCriterion("scrapbills between", value1, value2, "scrapbills");
            return (Criteria) this;
        }

        public Criteria andScrapbillsNotBetween(String value1, String value2) {
            addCriterion("scrapbills not between", value1, value2, "scrapbills");
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

        public Criteria andEquipmentidIsNull() {
            addCriterion("equipmentid is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIsNotNull() {
            addCriterion("equipmentid is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidEqualTo(String value) {
            addCriterion("equipmentid =", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotEqualTo(String value) {
            addCriterion("equipmentid <>", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThan(String value) {
            addCriterion("equipmentid >", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThanOrEqualTo(String value) {
            addCriterion("equipmentid >=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThan(String value) {
            addCriterion("equipmentid <", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThanOrEqualTo(String value) {
            addCriterion("equipmentid <=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLike(String value) {
            addCriterion("equipmentid like", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotLike(String value) {
            addCriterion("equipmentid not like", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIn(List<String> values) {
            addCriterion("equipmentid in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotIn(List<String> values) {
            addCriterion("equipmentid not in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidBetween(String value1, String value2) {
            addCriterion("equipmentid between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotBetween(String value1, String value2) {
            addCriterion("equipmentid not between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractIsNull() {
            addCriterion("scrap_abstract is null");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractIsNotNull() {
            addCriterion("scrap_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractEqualTo(String value) {
            addCriterion("scrap_abstract =", value, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractNotEqualTo(String value) {
            addCriterion("scrap_abstract <>", value, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractGreaterThan(String value) {
            addCriterion("scrap_abstract >", value, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("scrap_abstract >=", value, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractLessThan(String value) {
            addCriterion("scrap_abstract <", value, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractLessThanOrEqualTo(String value) {
            addCriterion("scrap_abstract <=", value, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractLike(String value) {
            addCriterion("scrap_abstract like", value, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractNotLike(String value) {
            addCriterion("scrap_abstract not like", value, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractIn(List<String> values) {
            addCriterion("scrap_abstract in", values, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractNotIn(List<String> values) {
            addCriterion("scrap_abstract not in", values, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractBetween(String value1, String value2) {
            addCriterion("scrap_abstract between", value1, value2, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andScrapAbstractNotBetween(String value1, String value2) {
            addCriterion("scrap_abstract not between", value1, value2, "scrapAbstract");
            return (Criteria) this;
        }

        public Criteria andResponsibleIsNull() {
            addCriterion("responsible is null");
            return (Criteria) this;
        }

        public Criteria andResponsibleIsNotNull() {
            addCriterion("responsible is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibleEqualTo(String value) {
            addCriterion("responsible =", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotEqualTo(String value) {
            addCriterion("responsible <>", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleGreaterThan(String value) {
            addCriterion("responsible >", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleGreaterThanOrEqualTo(String value) {
            addCriterion("responsible >=", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleLessThan(String value) {
            addCriterion("responsible <", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleLessThanOrEqualTo(String value) {
            addCriterion("responsible <=", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleLike(String value) {
            addCriterion("responsible like", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotLike(String value) {
            addCriterion("responsible not like", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleIn(List<String> values) {
            addCriterion("responsible in", values, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotIn(List<String> values) {
            addCriterion("responsible not in", values, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleBetween(String value1, String value2) {
            addCriterion("responsible between", value1, value2, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotBetween(String value1, String value2) {
            addCriterion("responsible not between", value1, value2, "responsible");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeIsNull() {
            addCriterion("scrap_time is null");
            return (Criteria) this;
        }

        public Criteria andScrapTimeIsNotNull() {
            addCriterion("scrap_time is not null");
            return (Criteria) this;
        }

        public Criteria andScrapTimeEqualTo(Date value) {
            addCriterion("scrap_time =", value, "scrapTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeNotEqualTo(Date value) {
            addCriterion("scrap_time <>", value, "scrapTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeGreaterThan(Date value) {
            addCriterion("scrap_time >", value, "scrapTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scrap_time >=", value, "scrapTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeLessThan(Date value) {
            addCriterion("scrap_time <", value, "scrapTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeLessThanOrEqualTo(Date value) {
            addCriterion("scrap_time <=", value, "scrapTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeIn(List<Date> values) {
            addCriterion("scrap_time in", values, "scrapTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeNotIn(List<Date> values) {
            addCriterion("scrap_time not in", values, "scrapTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeBetween(Date value1, Date value2) {
            addCriterion("scrap_time between", value1, value2, "scrapTime");
            return (Criteria) this;
        }

        public Criteria andScrapTimeNotBetween(Date value1, Date value2) {
            addCriterion("scrap_time not between", value1, value2, "scrapTime");
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

        public Criteria andCreatebillsemployeeidIsNull() {
            addCriterion("createbillsemployeeid is null");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidIsNotNull() {
            addCriterion("createbillsemployeeid is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidEqualTo(String value) {
            addCriterion("createbillsemployeeid =", value, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidNotEqualTo(String value) {
            addCriterion("createbillsemployeeid <>", value, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidGreaterThan(String value) {
            addCriterion("createbillsemployeeid >", value, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("createbillsemployeeid >=", value, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidLessThan(String value) {
            addCriterion("createbillsemployeeid <", value, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidLessThanOrEqualTo(String value) {
            addCriterion("createbillsemployeeid <=", value, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidLike(String value) {
            addCriterion("createbillsemployeeid like", value, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidNotLike(String value) {
            addCriterion("createbillsemployeeid not like", value, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidIn(List<String> values) {
            addCriterion("createbillsemployeeid in", values, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidNotIn(List<String> values) {
            addCriterion("createbillsemployeeid not in", values, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidBetween(String value1, String value2) {
            addCriterion("createbillsemployeeid between", value1, value2, "createbillsemployeeid");
            return (Criteria) this;
        }

        public Criteria andCreatebillsemployeeidNotBetween(String value1, String value2) {
            addCriterion("createbillsemployeeid not between", value1, value2, "createbillsemployeeid");
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