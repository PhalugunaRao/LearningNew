package com.example.learningnew

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            val context = LocalContext.current
            Column(
                modifier = Modifier.verticalScroll(scrollState)
            ) {
                ButtonComponent(
                    context = context,
                    intent = Intent(context, SimpleTextActivity::class.java),
                    buttonText = "Simple Text"
                )
                Divider(color = Color.Black)

                ButtonComponent(
                    context = context,
                    intent = Intent(context, TextStylingActivity::class.java),
                    buttonText = "Text Styling"
                )
                Divider(color = Color.Black)

                ButtonComponent(
                    context = context,
                    intent = Intent(context, TextFieldActivity::class.java),
                    buttonText = "Text Field (EditText)"
                )
                Divider(color = Color.Black)

                ButtonComponent(
                    context = context,
                    intent = Intent(context, SimplePreviewActivity::class.java),
                    buttonText = "Simple Preview"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, PreviewParameterActivity::class.java),
                    buttonText = "Preview Parameter"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, ColumnActivity::class.java),
                    buttonText = "Simple Column"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, ScrollableColumnActivity::class.java),
                    buttonText = "Scrollable Column"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, LazyColumnActivity::class.java),
                    buttonText = "Lazy Column"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, RowActivity::class.java),
                    buttonText = "Row"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, ScrollableRowActivity::class.java),
                    buttonText = "Scrollable Row"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, LazyRowActivity::class.java),
                    buttonText = "Lazy Row"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, BoxActivity::class.java),
                    buttonText = "Box"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, StackActivity::class.java),
                    buttonText = "Stack (Deprecated)"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, ConstraintLayoutActivity::class.java),
                    buttonText = "Constraint Layout"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, MaterialButtonActivity::class.java),
                    buttonText = "Button"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, CardExampleActivity::class.java),
                    buttonText = "Card"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, ClickableExampleActivity::class.java),
                    buttonText = "Clickable"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, ImageActivity::class.java),
                    buttonText = "Image"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, AlertDialogActivity::class.java),
                    buttonText = "Alert Dialog"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, SingleChoiceDialogActivity::class.java),
                    buttonText = "Single Choice Dialog"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, MaterialAppBarActivity::class.java),
                    buttonText = "Material App Bar"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, MaterialBottomNavigationActivity::class.java),
                    buttonText = "Material Bottom Navigation"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, MaterialCheckBoxActivity::class.java),
                    buttonText = "Material Checkbox"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, MaterialProgressActivity::class.java),
                    buttonText = "Material Progress Bar"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, MaterialRadioButtonActivity::class.java),
                    buttonText = "Material Radio Button"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, MaterialSliderActivity::class.java),
                    buttonText = "Material Slider"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, MaterialSnackbarActivity::class.java),
                    buttonText = "Material Snackbar"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, MaterialSwitchActivity::class.java),
                    buttonText = "Material Switch"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, CustomViewActivity::class.java),
                    buttonText = "Custom View"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, CrossFadeAnimationActivity::class.java),
                    buttonText = "Crossfade Animation"
                )
                Divider(color = Color.Black)
                ButtonComponent(
                    context = context,
                    intent = Intent(context, ShapeRotationActivity::class.java),
                    buttonText = "Shape Rotation Animation"
                )
            }
        }
    }
}
