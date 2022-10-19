package com.example.tarotgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity2 extends AppCompatActivity {

    ImageView CardsImg;
    TextView cardClickText;

    TextView mixKor, pickKor;
    Button MixBtn, pickBtn;

    ArrayList<TarotData> tarotdatalist;

    GridView TarotGridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        CardsImg = (ImageView) findViewById(R.id.CardsImg);
        CardsImg.setClickable(false);
        cardClickText = (TextView) findViewById(R.id.cardClickText);
        cardClickText.setVisibility(View.GONE);

        tarotdatalist = new ArrayList<TarotData>();
        tarotdatalist.add(new TarotData("바보 카드", "타로카드는 바보의 여행으로 시작됩니다. 이것은 당신 인생의 새로운 주기를 제안합니다. 그의 가방은 당신의 개인적인 경험을 반영하고, 그의 개는 당신에게 믿을 수 있는 동반자를 상기시켜 줍니다. 휴식을 취하고 다시 시작할 시간입니다. 모험이 시작됩니다.",
                "#자기표현 #순수한 #낙천주의 #새출발", R.drawable.card01));
        tarotdatalist.add(new TarotData("마법사카드", "당신은 게임의 정점에 있으며, 당신 안에 보편적인 힘을 가지고 있습니다. 당신 안에 에너지가 넘칩니다. 당신의 주의를 기울이는 것은 어느 것이든 환하게 밝힐 수 있다는 것을 기억하세요. 깨어 있으십시요. 그리고 경계하세요",
                "#카리스마 #에너지주도 #최고의조종자 #동적에너지", R.drawable.card02));
        tarotdatalist.add(new TarotData("여사제 카드", "모든 비밀, 질문, 답변은 당신 안에 있습니다. 당신이 열쇠를 가지고 있습니다. 당신과 그리고 상황이 적절한 시기에 전개되도록 허용하세요. 여사제 당신의 모든 것을 반영합니다. 자신의 내면에 대해 깊이 이해하세요.",
                "#타고난지식 #진정성 #제3의눈 #침묵", R.drawable.card03));
        tarotdatalist.add(new TarotData("여황제 카드", "어머니의 원형인 여황제는 당신이 양육하고 표현하는 모든 방식을 반영합니다. 당신 자신보다 먼저 당신이 가지고 있는 자원을 사용하세요. 당신을 더 대담하고 확장되도록 허용하세요. 당신의 천재성으로 세상을 현혹시키십시오.",
                "#모든형태의모성 #여신 #창의력 #명석함", R.drawable.card04));
        tarotdatalist.add(new TarotData("황제 카드", "황제는 아버지의 원형으로 당신의 꿈의 세계를 건설할 수 있는 견고한 기초를 만드는 것을 반영합니다. 그것은 당신의 생활방식의 형태와 조직에 근거한 창조성 입니다.",
                "#권위주의 #견고한 #질서 #의견", R.drawable.card05));
        tarotdatalist.add(new TarotData("사제 카드", "사제는 전세계 모든 문화권에서 볼 수 있는 종교적인 인물입니다. 그는 모든 문화권에서 영적인 권위의 원형입니다. 그는 당신이 보이지 않는 세계와 접촉하는 방식을 반영하고, 영적인 영역에 대한 당신의 태도를 반영합니다. ",
                "#사회적기대 #로마교황 #교리와성경 #선생님", R.drawable.card06));
        tarotdatalist.add(new TarotData("연인 카드", "연인카드는 무엇이 가능한지를 보여주지만 무엇을 지속할 수 없는지도 보여줍니다. 구애, 위험한 연락, 연인의 원형은 놀이에 대한 당신의 에로틱한 사람의 불과 에너지와 흥분에 기반을 두는 능력을 포함하고 있습니다.",
                "#로맨스 #새로운관계 #선택 #열정과사랑", R.drawable.card07));
        tarotdatalist.add(new TarotData("전차 카드", "삶의 고삐를 잡고 선택한 방향으로 출발하십시요. 전차는 많은 목적지를 염두에 두고 필요에 따라 다시 조절할 수 있음을 상기시킵니다. 당신을 추진하기 위해 배운 교훈들을 사용합니다. 앞쪽으로 전진하세요",
                "#목적지 #계획 #제어 #속도", R.drawable.card08));
        tarotdatalist.add(new TarotData("힘 카드", "당신의 모든 힘은 목표와 과제를 성취하는데 사용하실 수 있습니다. 훈련된 접근방식으로 내면의 힘을 유지하십시요. 개인적인 에너지를 낭비하지 마십시요. 인생의 모든 도전은 당신을 강하게 만들었습니다.",
                "#꿋꿋함 #견고함 #부드러운제어 #안정", R.drawable.card09));
        tarotdatalist.add(new TarotData("은둔자카드", "세상을 벗어나 타인의 소음과 자아의 벽으로 여행을 떠나는 시간 입니다. 당신만이 얻을 수 있는 지혜는 내면에서 찾을 수 있습니다. 조용한 시간이 해결과 이해로 안내합니다.",
                "#내면여행 #혼자만의시간 #격리 #강요된고독", R.drawable.card10));
        tarotdatalist.add(new TarotData("운명의 수레바퀴 카드", "당신은 인간의 이해 능력을 넘어선 에너지가 존재합니다. 그것은 모든 삶을 가능하게 하는 마법과 활력의 끈을 생성합니다. 핸들의 중심을 유지하고 균형을 잃지 않을 것입니다.",
                "#행운과운명 #혁명 #행운의변화 #우주적인혁명", R.drawable.card11));
        tarotdatalist.add(new TarotData("정의 카드", "삶의 정당한 절차는 당신이 나타나서 자신과 다른 사람을 위해 자신을 드러낼 것을 요구합니다. 정의의 칼은 언제나 진실을 가리킵니다. 당신의 삶에 대한 책임을 지십시요. 당신은 쏟은 노력은 당신에게 돌아갑니다.",
                "#진실 #법과질서 #일 #사법적결정", R.drawable.card12));
        tarotdatalist.add(new TarotData("매달린 남자 카드", "당신은 새로운 관점과 잠시의 멈춤이 필요한 상황입니다. 인생은 상대적 입니다. 기준점의 변경이 필요합니다. 머리의 물건을 뒤집어서 상황을 흔들어 내세요.",
                "#자각몽 #비전 #새로운방식의세상 #인버전", R.drawable.card13));
        tarotdatalist.add(new TarotData("죽음 카드", "삶, 죽음, 변화는 삶의 본질입니다. 오래된 패턴, 습관, 사물들을 새로운 것들이 들어올 수 있도록 버리십시요. 그리고 힘을 키우십시요. 순간을 소중히 하면서 변화를 받아들이세요. 끝은 시작이고 시작은 다른 것의 끝입니다. 이것이 인생의 역설입니다.",
                "#변화 #부활 #재건 #이미 행해진 일은 되돌릴 수 없습니다.", R.drawable.card14));
        tarotdatalist.add(new TarotData("절제 카드", "융합되는 과정. 자신이 속한 모든 세계에 기반을 두십시요. 길은 당신과 당신 너머에 펼쳐져 있습니다. 당신은 새로운 높이로 그것을 따를 것인가요? 균형의 기준선을 찾기 위해 삶의 측면에서 균형을 잡으세요.",
                "#복잡성 #정화 #정제 #세대", R.drawable.card15));
        tarotdatalist.add(new TarotData("악마 카드", "우리 각자의 어둠은 악마에게 힘을 줍니다. 대인관계를 살펴보세요. 당신은 어떻게 취급받고 있는지, 당신은 다른 사람을 어떻게 취급하는지에 대해 살펴보세요. 자신에 대해 인정하기에는 너무 무서운 욕망, 필요, 충동을 채우는 그림자와 자아.",
                "#사악한 #악마의춤 #어둠 #화", R.drawable.card16));
        tarotdatalist.add(new TarotData("탑 카드", "모든 선입견을 버리십시요. 이 순간은 당신을 깨워주는 찰나의 순간입니다. 당신의 중심이 흔들린다 느낄지도 모르지만 그것이 당신의 오해의 주문에서 당신을 깨뜨릴 수 있는 유일한 방법 입니다.",
                "#예상치못한충격 #폭발 #붕괴 #처음부터 맞지 않는 것을 풀어라", R.drawable.card17));
        tarotdatalist.add(new TarotData("스타 카드", "폭풍우 뒤에 오는 고요함. 밤하늘의 고요함. 다른 모든 카드 중에서 이 카드는 명확성과 영감의 최고 카드 입니다. 별빛과 별빛이 품고있는 모든 치유가능성을 의미합니다. 당신은 안전하고 보호됩니다.",
                "#천체의 #아름다움 #희망 #친교", R.drawable.card18));
        tarotdatalist.add(new TarotData("달 카드", "달카드는 잠재의식 잔물결의 깊은 웅덩이. 당신 내면의 무언가가 태어나고 빛을 보고 싶어합니다. 심련의 섬광과 기이한 경험을 위한 공간을 만들어 놓으십시오.",
                "#꿈과밤잠 #이상한감정 #기묘함 #무의식에서새로운것의출현", R.drawable.card19));
        tarotdatalist.add(new TarotData("태양 카드", "당신의 삶에서 빛나는 여름날의 모든 광채. 모든 것이 가능하고 당신의 손 안에 있는 것처럼 보입니다. 삶은 황홀하고 매혹적입니다. 마음의 소원을 향해 나아가십시오. 당신은 자유 입니다.",
                "#성장 #자유 #성공 #건강", R.drawable.card20));
        tarotdatalist.add(new TarotData("판단 카드", "당신의 영혼 깊은 곳에서 변화와 혁명이 일어납니다. 모든 것이 달라집니다. 당신은 변화하고 있고 진화하고 있고, 적응되고 있어요. 상황이 불편할 수 있지만, 믿을 수 없는 마성이 일어나는데 저항하지 말고 그대로 있으세요.",
                "#진화 #내부변화 #새로운날이다가옴 #깨우다", R.drawable.card21));
        tarotdatalist.add(new TarotData("월드 카드", "가장 높은 카드이자 인생의 무한대에서 시작을 도는 궁극의 엔딩. 자신과 주변 세계와의 완전한 통합. 당신의 마음의 욕망의 절정. 행복감이 당신의 존재를 통해 흐릅니다. 흐름의 상태에 있는 자신을 발견합니다.",
                "#완성 #성공 #통합 #영원한니르바나", R.drawable.card22));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                cardClickText.setVisibility(View.VISIBLE);
                CardsImg.setClickable(true);
            }
        },500);

        CardsImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardClickText.setVisibility(View.GONE);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        CardsImg.setImageResource(R.drawable.onecard);
                        Collections.shuffle(tarotdatalist);
                        cardClickText.setText("카드가 섞어졌습니다.");
                        cardClickText.setVisibility(View.VISIBLE);
                        CardsImg.setClickable(false);

                        MixBtn = (Button) findViewById(R.id.MixBtn);
                        pickBtn = (Button) findViewById(R.id.pickBtn);
                        mixKor = (TextView) findViewById(R.id.mixKor);
                        pickKor = (TextView) findViewById(R.id.pickKor);

                        Handler handler1 = new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                CardsImg.setImageResource(R.drawable.cards);
                                cardClickText.setVisibility(View.GONE);

                                pickKor.setText("카드 선택");
                                pickBtn.setText("Select");

                                mixKor.setVisibility(View.VISIBLE);
                                pickKor.setVisibility(View.VISIBLE);
                                MixBtn.setVisibility(View.VISIBLE);
                                pickBtn.setVisibility(View.VISIBLE);
                                clickEvent();
                            }
                        },1300);

                    }
                },800);

            }
        });


    }

    // 메서드

    void clickEvent() {
        MixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        CardsImg.setImageResource(R.drawable.onecard);
                        Collections.shuffle(tarotdatalist);
                        cardClickText.setText("카드가 섞어졌습니다.");
                        cardClickText.setVisibility(View.VISIBLE);
                        CardsImg.setClickable(false);

                        mixKor.setVisibility(View.GONE);
                        pickKor.setVisibility(View.GONE);
                        MixBtn.setVisibility(View.GONE);
                        pickBtn.setVisibility(View.GONE);

                        Handler handler1 = new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                CardsImg.setImageResource(R.drawable.cards);
                                cardClickText.setVisibility(View.GONE);
                                mixKor.setVisibility(View.VISIBLE);
                                pickKor.setVisibility(View.VISIBLE);
                                MixBtn.setVisibility(View.VISIBLE);
                                pickBtn.setVisibility(View.VISIBLE);
                                clickEvent();
                            }
                        },1300);

                    }
                },800);

            }
        });


        pickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
                intent.putExtra("tarot", tarotdatalist);
                startActivity(intent);

            }
        });

    }


}
