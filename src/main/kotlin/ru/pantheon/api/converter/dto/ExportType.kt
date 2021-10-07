package ru.pantheon.api.converter.dto

/**
 * Перечисление типов экспорта.
 *
 * @author Maksim Askhaev
 */
enum class ExportType(val extension: String) {
    DOCX("docx"), PDF("pdf");
}
