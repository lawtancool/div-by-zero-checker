package org.checkerframework.checker.dividebyzero.qual;

import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * You do not want a qualifier `@Top`. It appears here as a placeholder, so that the project
 * compiles.
 */
@SubtypeOf({Zero.class, NonZero.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Bottom {}
