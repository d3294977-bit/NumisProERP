package com.numisproerp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Перетворює ключ шрифту з налаштувань на [FontFamily] для Compose.
 * Підтримуються чотири системні сімейства (system / sans-serif / serif / monospace).
 */
fun fontFamilyOf(key: String?): FontFamily = when (key) {
    "serif" -> FontFamily.Serif
    "sans-serif" -> FontFamily.SansSerif
    "monospace" -> FontFamily.Monospace
    else -> FontFamily.Default
}

/**
 * Будує [Typography] з заданим [family] (з налаштувань шрифту) та опціональним
 * [textColor] (якщо користувач у Налаштуваннях обрав конкретний колір тексту,
 * він застосовується до кожного TextStyle).
 */
fun buildTypography(
    family: FontFamily = FontFamily.Default,
    textColor: Color = Color.Unspecified
): Typography {
    fun TextStyle.skin(): TextStyle = this.copy(fontFamily = family, color = textColor)
    return Typography(
        displayLarge = Typography.displayLarge.skin(),
        displayMedium = Typography.displayMedium.skin(),
        displaySmall = Typography.displaySmall.skin(),
        headlineLarge = Typography.headlineLarge.skin(),
        headlineMedium = Typography.headlineMedium.skin(),
        headlineSmall = Typography.headlineSmall.skin(),
        titleLarge = Typography.titleLarge.skin(),
        titleMedium = Typography.titleMedium.skin(),
        titleSmall = Typography.titleSmall.skin(),
        bodyLarge = Typography.bodyLarge.skin(),
        bodyMedium = Typography.bodyMedium.skin(),
        bodySmall = Typography.bodySmall.skin(),
        labelLarge = Typography.labelLarge.skin(),
        labelMedium = Typography.labelMedium.skin(),
        labelSmall = Typography.labelSmall.skin()
    )
}

// iOS-стиль типографіки (приблизно SF Pro): великі заголовки жирні,
// тіло — звичайної ваги, компактна шкала розмірів.
val Typography = Typography(
    displayLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp,
        letterSpacing = 0.37.sp,
        fontFamily = FontFamily.Default
    ),
    displayMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        letterSpacing = 0.36.sp,
        fontFamily = FontFamily.Default
    ),
    headlineLarge = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        letterSpacing = 0.35.sp,
        fontFamily = FontFamily.Default
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        letterSpacing = 0.38.sp,
        fontFamily = FontFamily.Default
    ),
    titleLarge = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 17.sp,
        letterSpacing = (-0.43).sp,
        fontFamily = FontFamily.Default
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp,
        letterSpacing = (-0.23).sp,
        fontFamily = FontFamily.Default
    ),
    titleSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        fontFamily = FontFamily.Default
    ),
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        letterSpacing = (-0.43).sp,
        fontFamily = FontFamily.Default
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        letterSpacing = (-0.23).sp,
        fontFamily = FontFamily.Default
    ),
    bodySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        fontFamily = FontFamily.Default
    ),
    labelLarge = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp,
        letterSpacing = (-0.23).sp,
        fontFamily = FontFamily.Default
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        fontFamily = FontFamily.Default
    ),
    labelSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        fontFamily = FontFamily.Default
    )
)
