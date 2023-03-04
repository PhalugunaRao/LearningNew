package com.example.learningnew

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningnew.data.Blog
import com.example.learningnew.data.getBlogList

class LazyColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnScrollableComponent(bloglist = getBlogList())
        }
    }

    @Composable
    private fun LazyColumnScrollableComponent(bloglist: List<Blog>) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(items = bloglist, itemContent = { data ->
                ItemRow(data)
            })
        }
    }
}

@Composable
fun ItemRow(data: Blog) {
    val context = LocalContext.current
    Card(
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier.fillMaxSize().padding(
            start = 16.dp,
            end = 16.dp,
            top = 5.dp,
            bottom = 5.dp
        ).clickable {
            Toast.makeText(context, "Author :${data.author}", Toast.LENGTH_LONG).show()
        }
    ) {
        Text(
            text = data.name,
            style = TextStyle(
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.padding(16.dp)
        )
    }
}
