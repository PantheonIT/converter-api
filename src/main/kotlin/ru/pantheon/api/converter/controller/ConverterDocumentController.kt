package ru.pantheon.api.converter.controller

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.core.io.Resource
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import ru.pantheon.api.converter.dto.ExportType

/**
 * Интерфейс, содержащий методы работы с документами системы.
 *
 * @author Oleg Bryzhevatykh
 */
@FeignClient(value = "converter", contextId = "document")
@RequestMapping("/api/space/{spaceId}")
interface ConverterDocumentController {

    /**
     * Выполняет процесс обработки документа [documentName] в пространстве [spaceId]. [fileId] и [versionId]
     * используются для последующего уведомления ядра о завершении процесса обработки документа.
     */
    @PostMapping("/document")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun processDocument(@PathVariable spaceId: Long, @RequestParam fileId: Long, @RequestParam versionId : Long,
                        @RequestParam documentName: String, @RequestParam auto: Boolean)

    /**
     * Выполняет преобразование переданного [html] в формат [type]. Картинки в переданном документе загружаются в тело
     * документа. [spaceId] используется для определения межстоположения изображений.
     */
    @PostMapping("/document/export")
    fun exportDocument(@PathVariable spaceId: Long, @RequestParam type: ExportType, @RequestBody html: String):
        ResponseEntity<Resource>
}
