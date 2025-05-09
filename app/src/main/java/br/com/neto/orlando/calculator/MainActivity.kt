package br.com.neto.orlando.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.neto.orlando.calculator.model.CalculatorViewModel
import br.com.neto.orlando.calculator.ui.theme.CalculatorTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import br.com.neto.orlando.calculator.ui.layoult.Calculator
import br.com.neto.orlando.calculator.ui.theme.MediumGray


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                val viewModel: CalculatorViewModel = viewModel()
                val state = viewModel.state
                val buttonSpacing = 8.dp

                Calculator(
                    state = state,
                    onAction = viewModel::onAction,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MediumGray)
                        .padding(16.dp)
                )
            }
        }
    }

}

