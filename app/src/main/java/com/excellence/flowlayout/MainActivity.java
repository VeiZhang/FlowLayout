package com.excellence.flowlayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.excellence.flowlibrary.BGAFlowLayout;
import com.excellence.flowlibrary.FlowLayout;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
//	private String[] mLabels = { "因", "业务", "发展需要，", "我们", "需要定制开发一款教育学习机产品，", "终端为PAD，", "需要配合", "手机端", "APP", "及其他单项APP，", "以", "实现", "相关", "运营策略。", "产品应用范围商场销售渠道、", "教育中心、", "电商渠道等，", "需要", "此",
//			"学习机", "具备", "家长管理、", "应用商城、", "分类内容显示、", "个人中心、", "语音留言等功能" };

	private String[] mLabels = { "秋水微澜", "云卷云舒", "风", "在秋日里潇洒而飘逸", "静美的秋", "像女子干净的微笑", "秋风起", "卷起层层涟漪", "----题记", "一个人", "站在秋光里", "赏雁影翩飞", "看秋烟柔美", "落日烟霞", "多么的惬意", "蒹葭苍苍", "白露为霜", "所谓伊人", "在水一方",
			"溯洄从之", "道阻且长", "溯游从之", "宛在水中央", "多美的季节", "多美的伊人", "多美的画面", "婉约的姿态", "一个眼神里的凝望", "都羡煞了秋光", "醉了水中的涟漪", "醉了秋叶里的静美", "女子如是", "多好呀", "女子之美", "不光外在", "一定还要有内在", "女子的美丽", "有两种", "一种是来自灵魂的内在之美",
			"一种来自外在之美", "内在之美", "是指的一个女子气质之美", "德馨之美", "外在美", "指的一个女子的容貌之美", "这种美处于视觉和眼观", "外在的美丽", "需要的是护肤品上的保养", "需要金钱来滋补你的肤色", "当然了", "女子若可以保持豁达的心境", "让自己保持最美", "最愉悦的精神状态", "也是减少衰老的最好良药",
			"我比较喜欢一个人的内在之美", "它不会让你视觉疲劳", "它更加不会伴随时间成为衰色", "美丽的皮肤", "终究熬不过时间这把无情刀", "也唯有内在之美", "才会让你永葆青春" };
	private List<String> mLabelList = Arrays.asList(mLabels);

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initFlowLayout();
		initBGAFlowLayout();
	}

	private void initBGAFlowLayout()
	{
		BGAFlowLayout bgaFlowLayout = (BGAFlowLayout) findViewById(R.id.bga_flow_layout);
		for (String label : mLabelList)
		{
			TextView textView = new TextView(this);
			textView.setText(label);
			textView.setBackgroundColor(Color.RED);
			textView.setTextColor(Color.WHITE);
			textView.setTextSize(25);
			textView.setGravity(Gravity.CENTER);
			textView.setPadding(10, 10, 10, 10);
			textView.setTag(BGAFlowLayout.class.getSimpleName() + label);
			textView.setOnClickListener(this);
			ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			textView.setLayoutParams(params);
			bgaFlowLayout.addView(textView);
		}
	}

	private void initFlowLayout()
	{
		FlowLayout flowLayout = (FlowLayout) findViewById(R.id.flow_layout);
		for (String label : mLabelList)
		{
			TextView textView = new TextView(this);
			textView.setText(label);
			textView.setBackgroundColor(Color.CYAN);
			textView.setTextColor(Color.WHITE);
			textView.setTextSize(25);
			textView.setGravity(Gravity.CENTER);
			textView.setPadding(10, 10, 10, 10);
			textView.setTag(FlowLayout.class.getSimpleName() + label);
			textView.setOnClickListener(this);
			ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			textView.setLayoutParams(params);
			flowLayout.addView(textView);
		}
	}

	@Override
	public void onClick(View v)
	{
		Toast.makeText(this, v.getTag().toString(), Toast.LENGTH_SHORT).show();
	}
}
