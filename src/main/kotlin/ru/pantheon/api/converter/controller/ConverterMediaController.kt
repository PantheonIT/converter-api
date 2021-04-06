package ru.pantheon.api.converter.controller

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import ru.pantheon.api.converter.dto.ConverterAudioDTO
import ru.pantheon.api.converter.dto.ConverterThumbDTO
import ru.pantheon.api.converter.dto.ConverterVideoDTO

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
    fun processImage(@PathVariable spaceId: Long, @RequestParam imageName: String): List<ConverterThumbDTO>

    @PostMapping("/video")
    fun processVideo(@PathVariable spaceId: Long, @RequestParam videoName: String): ConverterVideoDTO

    @PostMapping("/audio")
    fun processAudio(@PathVariable spaceId: Long, @RequestParam audioName: String): ConverterAudioDTO
}