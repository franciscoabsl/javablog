package com.franciscoabsl.javablog.enums;

public enum PostFormat {
    HTML("html"),
    MARKDOWN("markdown");

    private String displayName;

    PostFormat(String displayName)  {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getId() {
        return name();
    }

    @Override
    public String toString() {
        return getDisplayName();
    }
}
