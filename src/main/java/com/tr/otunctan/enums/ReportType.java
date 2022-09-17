package com.tr.otunctan.enums;

public enum ReportType {

    PDF() {
        @Override
        public String getExtension() {
            return ".pdf";
        }
    }, XML() {
        @Override
        public String getExtension() {
            return ".xml";
        }
    },
    EXCEL() {
        @Override
        public String getExtension() {
            return ".xls";
        }
    },
    HTML() {
        @Override
        public String getExtension() {
            return ".html";
        }
    };

    public abstract String getExtension();

}
