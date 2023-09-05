package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//문자열 리소스와, 이미지 리소스로 구성된 데이터 클래스
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
