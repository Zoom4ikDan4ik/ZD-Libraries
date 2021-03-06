package ru.zoom4ikdan4ik.systems.paths.enums;

import org.jetbrains.annotations.NotNull;
import ru.zoom4ikdan4ik.systems.paths.data.ExcludeData;

import java.util.ArrayList;
import java.util.List;

public enum PathRuleType {
    TO_FIRST,
    TO_LAST,
    ALL,
    IGNORE_FOLDERS,
    IGNORE_FOLDERS_FILES;

    private final List<ExcludeData> excludes;

    PathRuleType() {
        this.excludes = new ArrayList<>();
    }

    @NotNull
    public final PathRuleType addExclude(final String exclude) {
        return this.addExclude(new ExcludeData(exclude));
    }

    @NotNull
    public final PathRuleType addExclude(final ExcludeData exclude) {
        this.excludes.add(exclude);

        return this;
    }

    @NotNull
    public final List<ExcludeData> getExcludes() {
        return this.excludes;
    }
}
