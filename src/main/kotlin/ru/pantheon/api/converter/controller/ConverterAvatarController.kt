package ru.pantheon.api.converter.controller

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

/**
 * Интерфейс, содержащий методы для работы с аватарками пользователей системы.
 *
 * @author Oleg Bryzhevatykh
 */
@FeignClient(value = "converter", contextId = "avatar")
@RequestMapping("/api")
interface ConverterAvatarController {

    /**
     * Выполняет обработку аватарки по имени [avatarName]. Вырезает из изображения квадрат и сжимает до установленных в
     * конфигурации размеров.
     */
    @PostMapping("/avatar")
    fun processAvatar(@RequestParam avatarName: String)
}
