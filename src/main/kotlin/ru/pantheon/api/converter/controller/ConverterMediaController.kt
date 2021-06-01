package ru.pantheon.api.converter.controller

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus

/**
 * Интерфейс, содержащий методы для обработки медиа-файлов системы.
 *
 * @author Oleg Bryzhevatykh
 */
@FeignClient(value = "converter", contextId = "media")
@RequestMapping("/api/space/{spaceId}")
interface ConverterMediaController {

    /**
     * Выполняет обработку изображения [imageName] в файловом хранилище пространства [spaceId].
     */
    @PostMapping("/image")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun processImage(@PathVariable spaceId: Long, @RequestParam fileId: Long, @RequestParam versionId : Long, @RequestParam imageName: String)

    @PostMapping("/video")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun processVideo(@PathVariable spaceId: Long, @RequestParam fileId: Long, @RequestParam versionId : Long, @RequestParam videoName: String)

    @PostMapping("/audio")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun processAudio(@PathVariable spaceId: Long, @RequestParam fileId: Long, @RequestParam versionId : Long, @RequestParam audioName: String)
}